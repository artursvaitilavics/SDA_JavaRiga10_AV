package sda.hmwork.abstractHM.task02;

import sda.hmwork.abstractHM.task02.components.templ.Body;
import sda.hmwork.abstractHM.task02.components.templ.Exhaust;

public class Car {
    static int id = 1;
    int localId;
    Body body;
    Exhaust exhaust;


    public Car(Body body, Exhaust exhaust) {
        this.body = body;
        this.exhaust = exhaust;
        localId = id;
        this.id++;

    }

    @Override
    public String toString() {
        return "Car " + localId + ":" +
                "\n\t" + body.toString() +
                "\n\t" + exhaust.toString()
//                ", suspension=" + suspension +
                ;
    }
}
