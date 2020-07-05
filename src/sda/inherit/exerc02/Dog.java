package sda.inherit.exerc02;

public class Dog implements Animal {

    @Override
    public void yieldVoice() {
        System.out.println("woof");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
