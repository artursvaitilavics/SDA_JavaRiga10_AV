package sda.hmwork.encapsul.task02;

public class Car {
    private String make;
    private String color;
    private int price;

    public Car(String make, String color, int price) {
        this.make = make;
        this.color = color;
        this.price = price;
    }

    public Car(int price) {
        this("", "", price);
    }
}
