package at.ran.projects.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import at.ran.projects.shop.products.Product;

public class GUI {
    private Scanner scanner = new Scanner(System.in);
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void run() {
        while (true) {
            System.out.println("Please select...");
            System.out.println("1 List all Items");
            int selected = scanner.nextInt();

            switch (selected) {
                case 1:
                    printProducts();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid selection!");
            }
        }
    }

    public void printProducts() {
        for (Product prod : this.products) {
            System.out.println(prod.getName());
        }
    }
}
