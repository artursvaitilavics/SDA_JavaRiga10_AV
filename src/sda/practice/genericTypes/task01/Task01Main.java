package sda.practice.genericTypes.task01;

public class Task01Main {
    public static void main(String[] args) {
        Person person01 = new Person(180, "Bobby");
        Person person02 = new Person(120, "Toby");
        Person person03 = new Person(250, "Porzingis");

        printIfTaller(person01, person02);
        printIfTaller(person03, person01);
        printIfTaller(person02, person03);

    }

    public static void printIfTaller(Person person01, Person person02) {
        if (person01.compareTo(person02) > 0) {
            System.out.println(person01.toString() +
                    " is taller than " +
                    person02.toString());
        }
    }
}
