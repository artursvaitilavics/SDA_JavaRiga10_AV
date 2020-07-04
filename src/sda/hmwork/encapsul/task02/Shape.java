package sda.hmwork.encapsul.task02;

public class Shape {
    private String name;
    private String color;
    private int area;

    public Shape(String name, String color, int area) {
        this.name = name;
        this.color = color;
        this.area = area;
    }

    public Shape(int area) {
        this("", "", area);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("All shapes should have names");
        } else {
            this.name = name;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
