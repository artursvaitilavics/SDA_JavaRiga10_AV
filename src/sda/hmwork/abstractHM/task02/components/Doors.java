package sda.hmwork.abstractHM.task02.components;

import sda.hmwork.abstractHM.task02.components.templ.Body;

public class Doors extends Body {
    String color = "Black";

    @Override
    public void changeColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                " " + color +
                " door";
    }
}
