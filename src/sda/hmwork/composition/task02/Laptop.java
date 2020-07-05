package sda.hmwork.composition.task02;

import sda.hmwork.composition.task02.components.Display;
import sda.hmwork.composition.task02.components.Port;

public class Laptop {
    private Port port;
    private Display display;
    private static int number;

    public Laptop(Port port, Display display) {
        this.port = port;
        this.display = display;
        number++;
    }

    @Override
    public String toString() {
        return "Laptop number: " +
                number +
                "\n" + port.toString()
                +"\n" + display.toString();
    }
}
