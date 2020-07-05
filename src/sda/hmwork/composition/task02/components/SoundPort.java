package sda.hmwork.composition.task02.components;

public class SoundPort extends Port {
    String name;
    String function;
    private String audioDrive;

    public SoundPort(String name, String function) {

        super(name, function);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFunction() {
        return "Transfers sounds: beep beep";
    }

    @Override
    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n\t\t"
                + getFunction();
    }
}
