package sda.hmwork.composition;

import java.util.Arrays;

public class Bicycle {
    Steering steering;
    Wheel[] wheels;

    public Bicycle(Steering steering, Wheel[] wheels) {
        this.steering = steering;
        this.wheels = wheels;
    }
}

