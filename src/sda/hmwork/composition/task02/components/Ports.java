package sda.hmwork.composition.task02.components;

abstract public class Ports {
    private String name;
    private String function;

    public Ports(String name, String function) {
        this.name = name;
        this.function = function;
    }

    abstract public String getName();
    abstract public void setName();
    public abstract String getFunction();
    public abstract void setFunction(String function);

    @Override
    public String toString() {
        return name + " is for " + function;
    }
}
