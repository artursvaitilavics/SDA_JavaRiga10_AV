package sda.inherit.exerc01;

public class Rectangle extends Shapes {
    private int side01;
    private int side02;
    private int perimeter = 1;

    public Rectangle(int side01, int side02) {
        this.side01 = side01;
        this.side02 = side02;
    }

    @Override
    public int getPerimeter() {
        return perimeter;
    }

    @Override
    public void setPerimeter() {
        perimeter = 2 * (side01 + side02);
    }

}
