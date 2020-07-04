package sda.inherit.exerc01;

public class Circle extends Shapes {
    private final int PI = 3;
    private int radius;
    private int perimeter;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getPerimeter() {
        return perimeter;
    }

    @Override
    public void setPerimeter() {
        perimeter = 2 * (PI * radius);
    }


}
