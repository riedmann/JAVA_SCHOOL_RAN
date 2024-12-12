package at.ran.projects.shop;

import at.ran.projects.shop.products.Hat;
import at.ran.projects.shop.products.Shoe;

public class Main {
    public static void main(String[] args) {
        Shoe shoe1 = new Shoe(38, 40, "Sneaker1");
        Shoe shoe2 = new Shoe(38, 41, "Sneaker2");
        Shoe shoe3 = new Shoe(38, 44, "Sneaker3");
        Hat hat1 = new Hat("Round", 30, "Baseball Hat");

        GUI gui = new GUI();
        gui.addProduct(shoe3);
        gui.addProduct(shoe2);
        gui.addProduct(shoe1);
        gui.addProduct(hat1);
        gui.run();

    }
}
