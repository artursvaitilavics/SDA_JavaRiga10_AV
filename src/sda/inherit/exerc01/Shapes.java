package sda.inherit.exerc01;

public class Shapes {
    private int perimeter;
    private int areaSize;

    public Shapes(int perimeter, int areaSize) {
        this.perimeter = perimeter;
        this.areaSize = areaSize;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(int areaSize) {
        this.areaSize = areaSize;
    }
}
