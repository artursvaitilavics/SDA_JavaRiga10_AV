package thenewboston.stuff.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        Dog dog01 = new Dog();
        Cat cat01 = new Cat();

        animals[0] = dog01;
        animals[1] = cat01;

        for (Animal animal :
                animals) {
            animal.noise();
        }
    }
}
