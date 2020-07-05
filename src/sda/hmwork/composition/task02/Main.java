package sda.hmwork.composition.task02;

import sda.hmwork.composition.task02.components.*;

public class Main {
    public static void main(String[] args) {
        UsbPort usbPort01 = new UsbPort("USB 3.0",
                "Transfer Data", 50);
        Laptop laptop01 = new Laptop(usbPort01);
        System.out.println(laptop01);

    }
}
