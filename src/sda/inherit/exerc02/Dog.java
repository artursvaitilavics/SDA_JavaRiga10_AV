package sda.inherit.exerc02;

public class Dog extends Animal {

    @Override
    public void yieldVoice() {
        System.out.println("woof");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
