package sda.practice.composition;

public class CompMain {


    public static void main(String[] args) {
        Muzzle muzzle = new Muzzle();
        Dog dog = new Dog(muzzle);

        System.out.println(dog.getMuzzle().getColor());

    }
}
