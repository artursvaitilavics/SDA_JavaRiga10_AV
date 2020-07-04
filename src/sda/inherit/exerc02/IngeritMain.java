package sda.inherit.exerc02;

public class IngeritMain {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals
        ) {
            System.out.print(animal.toString() + " says: ");
            animal.yieldVoice();
        }
    }
}
