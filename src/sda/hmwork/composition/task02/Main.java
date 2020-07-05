package sda.hmwork.composition.task02;

import sda.hmwork.composition.task02.components.*;

public class Main {
    public static void main(String[] args) {
        UsbPort usbPort01 = new UsbPort("USB 3.0",
                "Transfer Data", 50);
        UsbPort usbPort02 = new UsbPort("USB 2.0",
                "Transfer Data", 10);

        SoundPort soundPort001 = new SoundPort(
                "Advanced audio",
                "play music");
        SoundPort soundPort002 = new SoundPort(
                "Cheap audio",
                "Kind of make noise");
        ScreenGlossy scrnGlossy001 = new ScreenGlossy(
                "Glossy Screen", 15, 50);
        ScreenGlossy scrnGlossy002 = new ScreenGlossy(
                "Mated Screen", 15, 0);

        Laptop laptop001 = new Laptop(usbPort01, scrnGlossy002);
        Laptop laptop002 = new Laptop(soundPort001, scrnGlossy001);
        Laptop laptop003 = new Laptop(soundPort002, scrnGlossy001);

        Laptop laptops[] = new Laptop[3];
        laptops[0] = laptop001;
        laptops[1] = laptop002;
        laptops[2] = laptop003;

        for (Laptop laptop :
                laptops) {
            System.out.println(laptop.toString());
        }

    }
}
