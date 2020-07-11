package sda.practice.inherit.exerc02;

public class Cat implements Animal {

    @Override
    public void yieldVoice() {
        System.out.println("meooow");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
