package sda.practice.inherit.exerc01;

public class Circle implements Shapes {
    int radius;
    int pi = 3;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getPerimeter() {
        return 2 * (pi * radius);
    }

    @Override
    public int getArea() {
        return pi * (radius * radius);
    }
}
