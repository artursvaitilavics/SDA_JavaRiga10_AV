package NewBostonTutsPolyM;

public class CarList {
    private Car[] cars = new Car[5];
    private int i = 0;

    public void add(Car car){
        if (i < cars.length){
            cars[i] = car;
            System.out.println("Car added at index " + i);
            i++;
        }
    }
}
