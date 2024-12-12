package at.ran.projects.amazon;

public class SuperGUI implements GUI {
    @Override
    public void run() {
        while (true) {
            System.out.println("supergui");
        }
    }

    @Override
    public void addProduct(Product product) {
    }
}
