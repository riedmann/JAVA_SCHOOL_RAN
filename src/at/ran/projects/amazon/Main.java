package at.ran.projects.amazon;

public class Main {
    public static void main(String[] args) {

        Milk milk1 = new Milk(20, "Milk 1", 2);
        Milk milk2 = new Milk(25, "Milk 2", 3);

        Joghurt joghurt1 = new Joghurt("Vanilla", "Joghurt 1", 4);
        Socks socks1 = new Socks();

        GUI gui = new ConsoleGUI();
        gui.addProduct(milk2);
        gui.addProduct(milk1);
        gui.addProduct(joghurt1);
        gui.addProduct(socks1);

        gui.run();
    }
}
