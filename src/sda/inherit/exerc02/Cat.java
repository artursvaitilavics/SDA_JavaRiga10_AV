package sda.inherit.exerc02;

public class Cat extends Animal {

    @Override
    public void yieldVoice() {
        System.out.println("meooow");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
