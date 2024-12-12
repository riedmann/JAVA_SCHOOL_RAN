package at.ran.projects.shop.products;

public class Shoe implements Product {
    // Kapselung
    private int size;
    private int price;
    private String name;

    public Shoe(int size, int price, String name) {
        this.size = size;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {

        return this.size + " " + this.name + " " + this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public int getSize() {
        return size;
    }

}
