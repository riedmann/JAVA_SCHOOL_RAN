package at.ran.projects.amazon;

public class Milk implements Product {
    // Kapselung
    private int fatContent;
    private String name;
    private int price;

    public Milk(int fatContent, String name, int price) {
        this.fatContent = fatContent;
        this.name = name;
        this.price = price;
    }

    public int getFatContent() {
        return fatContent;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
