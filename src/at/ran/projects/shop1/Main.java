package at.ran.projects.shop1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("red", "Supercar");
        Bike b1 = new Bike("green", "Superbike2");

        Gui gui = new Gui();
        gui.addProduct(c1);
        gui.addProduct(b1);
        gui.addProduct(new Cycle());

        gui.run();
    }
}
