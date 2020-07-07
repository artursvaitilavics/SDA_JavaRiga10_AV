package sda.hmwork.abstractHM.task02;

import sda.hmwork.abstractHM.task02.components.*;
import sda.hmwork.abstractHM.task02.components.templ.Body;
import sda.hmwork.abstractHM.task02.components.templ.Exhaust;

public class Task02Main {
    public static void main(String[] args) {
        Body door01 = new Doors();
        Body roof001 = new Roof();

        Exhaust silencer01 = new Silencer();
        Exhaust somPipe01 = new SomePipe();


        Car car001 = new Car(door01, silencer01);
        Car car002 = new Car(roof001, somPipe01);
        Car car003 = new Car(door01, somPipe01);

        System.out.println(car001.toString());
        System.out.println(car002.toString());
        System.out.println(car003.toString());

        door01.changeColor("White");
        roof001.changeColor("Red");
        silencer01.modifyQuality();
        somPipe01.modifyQuality();

        System.out.println();

        System.out.println(car001.toString());
        System.out.println(car002.toString());
        System.out.println(car003.toString());
    }
}
