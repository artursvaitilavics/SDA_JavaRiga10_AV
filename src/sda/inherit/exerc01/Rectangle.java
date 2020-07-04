package sda.inherit.exerc01;

public class Rectangle extends Shapes{
    private int cornerCount = 4; //Different form circle

    public Rectangle(int perimeter, int areaSize, int cornerCount) {
        super(perimeter, areaSize);
        this.cornerCount = cornerCount;
    }
}
