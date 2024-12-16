package at.ran.third.car;

public class Car {
    private String color;
    private static int amountOfTyres = 4;

    public Car(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getAmountOfTyres() {
        return amountOfTyres;
    }

    public static void setAmountOfTyres(int amountOfTyres) {
        amountOfTyres = amountOfTyres;
    }
}
