package at.ran.projects.cards;

import java.util.List;
import java.util.Scanner;

public class PokerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            playGame(scanner);

            System.out.print("\nWould you like to play again? (y/n): ");
            String playAgain = scanner.nextLine().trim().toLowerCase();
            if (!playAgain.equals("y")) {
                break;
            }
            System.out.println("\n--- New Game ---\n");
        }

        scanner.close();
    }

    private static void playGame(Scanner scanner) {
        Deck deck = new Deck();
        deck.shuffle();

        // Deal initial hands
        System.out.println("Drawing Blackjack hands:");
        List<Card> playerHand = deck.drawCards(2);
        List<Card> dealerHand = deck.drawCards(2);

        // Show dealer's up card
        System.out.println("\nDealer's up card:");
        System.out.println(dealerHand.get(0));

        // Player's turn
        int playerTotal = playHand(scanner, deck, playerHand, "Player");
        if (playerTotal > 21) {
            System.out.println("Player busts! Dealer wins!");
            return;
        }

        // Dealer's turn
        System.out.println("\nDealer's full hand:");
        int dealerTotal = playDealerHand(deck, dealerHand);

        // Determine winner
        determineWinner(playerTotal, dealerTotal);
    }

    private static int calculateHandValue(List<Card> hand) {
        int total = 0;
        int aces = 0;

        for (Card card : hand) {
            if (card.getValue() == 11) {
                aces++;
            }
            total += card.getValue();
        }

        while (total > 21 && aces > 0) {
            total -= 10;
            aces--;
        }

        return total;
    }

    private static int playHand(Scanner scanner, Deck deck, List<Card> hand, String player) {
        while (true) {
            System.out.println("\n" + player + "'s hand:");
            for (Card card : hand) {
                System.out.println(card);
            }

            int total = calculateHandValue(hand);
            System.out.println("Hand value: " + total);

            if (total > 21) {
                System.out.println("Bust!");
                return total;
            } else if (total == 21) {
                if (hand.size() == 2) {
                    System.out.println("Blackjack!");
                } else {
                    System.out.println("21!");
                }
                return total;
            }

            if (player.equals("Player")) {
                System.out.print("Do you want another card? (y/n): ");
                String answer = scanner.nextLine().trim().toLowerCase();
                if (!answer.equals("y")) {
                    return total;
                }
            } else {
                if (total >= 17) {
                    return total;
                }
                System.out.println("Dealer hits");
            }

            hand.add(deck.drawCards(1).get(0));
        }
    }

    private static int playDealerHand(Deck deck, List<Card> hand) {
        while (true) {
            System.out.println("\nDealer's hand:");
            for (Card card : hand) {
                System.out.println(card);
            }

            int total = calculateHandValue(hand);
            System.out.println("Hand value: " + total);

            if (total > 21) {
                System.out.println("Bust!");
                return total;
            } else if (total == 21) {
                if (hand.size() == 2) {
                    System.out.println("Blackjack!");
                } else {
                    System.out.println("21!");
                }
                return total;
            }

            if (total <= 16) {
                System.out.println("Dealer hits");
                hand.add(deck.drawCards(1).get(0));
            } else {
                return total;
            }
        }
    }

    private static void determineWinner(int playerTotal, int dealerTotal) {
        if (playerTotal > dealerTotal) {
            System.out.println("Player wins!");
        } else if (playerTotal < dealerTotal) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}