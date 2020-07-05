package sda.hmwork.composition.task02.components;

abstract public class Port {
    private String name;
    private String function;

    public Port(String name, String function) {
        this.name = name;
        this.function = function;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "\tPort: "
                + name
                + "\n\t\tFunction: "
                + function;
    }
}
