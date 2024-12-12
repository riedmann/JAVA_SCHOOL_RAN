package at.ran.projects.cards;

public class Card {
    private final String suit;
    private final String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    private String getSuitSymbol() {
        return switch (suit) {
            case "Hearts" -> "♥";
            case "Diamonds" -> "♦";
            case "Clubs" -> "♣";
            case "Spades" -> "♠";
            default -> "?";
        };
    }

    private String getDisplayRank() {
        return switch (rank) {
            case "10" -> "10";
            case "Jack" -> "J";
            case "Queen" -> "Q";
            case "King" -> "K";
            case "Ace" -> "A";
            default -> rank;
        };
    }

    public int getValue() {
        return switch (rank) {
            case "Jack", "Queen", "King" -> 10;
            case "Ace" -> 11; // In most poker games Ace is 11 or 1
            default -> Integer.parseInt(rank);
        };
    }

    @Override
    public String toString() {
        String displayRank = getDisplayRank();
        String suitSymbol = getSuitSymbol();

        return String.format("""
                ┌─────────┐
                │ %2s      │
                │         │
                │    %s    │
                │         │
                │      %2s │
                └─────────┘""", displayRank, suitSymbol, displayRank);
    }
}
