package sda.hmwork.abstractHM.task02.components.templ;

abstract public class Body {
    abstract public void changeColor(String color);

    @Override
    public String toString() {
        return "Body Part:";
    }
}
