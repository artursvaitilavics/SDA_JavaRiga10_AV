package sda.hmwork.composition.task01;

public class CompositionMain {
    public static void main(String[] args) {
        Tire tire01 = new Tire("BlackRubber");
        Tire tire02 = new Tire("BlackRubber with some stripes");

        Wheel[] wheels = new Wheel[2];
        wheels[0] = new Wheel(tire01 );
        wheels[1] = new Wheel(tire02);

        Bell bell = new Bell("Chrome Bell");
        Steering steering = new Steering("Fiber");
        steering.setBell(bell);

        Bicycle bicycle01 = new Bicycle(steering, wheels);
    }
}
