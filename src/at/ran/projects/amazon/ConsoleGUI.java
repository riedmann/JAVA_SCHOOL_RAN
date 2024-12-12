package at.ran.projects.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleGUI implements GUI {
    private Scanner scanner = new Scanner(System.in);
    private List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void run() {
        while (true) {
            System.out.println("1 Show Products");
            System.out.println("2 Storage Value");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showProducts();
                    break;
                case 2:
                    System.out.println(getStorageValue());
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public void showProducts() {
        for (Product product : products) {
            System.out.println("Name:" + product.getName() + " Price:" + product.getPrice());
        }
    }

    public int getStorageValue() {
        int storageValue = 0;
        for (Product product : products) {
            storageValue += product.getPrice();
        }
        return storageValue;
    }
}
