package PolyM;

public class Main {
    public static void main(String[] args) {

        Car[] car01 = new Car[2];

        car01[0] = new Zaz();
        car01[1] = new Vaz();

        for (int i = 0; i < 2; i++) {
            car01[i].doors();
        }
    }
}
