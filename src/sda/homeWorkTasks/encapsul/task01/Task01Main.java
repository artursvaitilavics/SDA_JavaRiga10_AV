package sda.homeWorkTasks.encapsul.task01;

public class Task01Main {
    public static void main(String[] args) {
        Person person01 = new Person("Boby", "Bobilly");
        person01.setHasWork(true);
        System.out.println(person01.toString());
        person01.setHasWork(false);
        person01.grow();
        System.out.println(person01.toString());
    }
}
