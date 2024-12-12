package at.ran.projects.amazon;

public class Joghurt implements Product {
    private String flavour;
    private String name;
    private int price;

    public Joghurt(String flavour, String name, int price) {
        this.flavour = flavour;
        this.name = name;
        this.price = price;
    }

    public String getFlavour() {
        return flavour;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
