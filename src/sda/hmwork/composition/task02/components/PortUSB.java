package sda.hmwork.composition.task02.components;

public class PortUSB extends Ports{
    private String name;
    private String function;

    public PortUSB(String name, String function, String name1, String function1) {
        super(name, function);
        this.name = name1;
        this.function = function1;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName() {

    }

    @Override
    public String getFunction() {
        return null;
    }

    @Override
    public void setFunction(String function) {

    }
}
