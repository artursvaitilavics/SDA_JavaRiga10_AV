package sda.inherit.exerc01;

public class Rectangle implements Shapes {
    int side01;
    int side02;

    public Rectangle(int side01, int side02) {
        this.side01 = side01;
        this.side02 = side02;
    }

    @Override
    public int getPerimeter() {
        return 2 * (side01 + side02);
    }

    @Override
    public int getArea() {
        return side01 * side02;
    }
}
