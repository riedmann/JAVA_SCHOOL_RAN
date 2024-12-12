package at.ran.projects.shop.products;

public class Hat implements Product {
    private String form;
    private int price;
    private String name;

    public Hat(String form, int price, String name) {
        this.form = form;
        this.price = price;
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
