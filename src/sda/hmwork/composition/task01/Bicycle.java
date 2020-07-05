package sda.hmwork.composition.task01;

public class Bicycle {
    Steering steering;
    Wheel[] wheels;

    public Bicycle(Steering steering, Wheel[] wheels) {
        this.steering = steering;
        this.wheels = wheels;
    }
}

