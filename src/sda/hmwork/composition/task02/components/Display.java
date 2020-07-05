package sda.hmwork.composition.task02.components;

abstract public class Display {
    private String name;
    private int size;

    public Display(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int screenType) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\tDisplay: "
                + name
                + "\n\t\tScreen size: "
                + size;
    }
}
