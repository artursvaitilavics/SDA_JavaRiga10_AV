package sda.hmwork.composition.task02;

import sda.hmwork.composition.task02.components.Port;

public class Laptop {
    private Port port;

    public Laptop(Port port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "port=" + port.toString() +
                '}';
    }
}
