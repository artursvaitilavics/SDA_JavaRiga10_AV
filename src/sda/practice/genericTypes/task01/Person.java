package sda.practice.genericTypes.task01;

public class Person implements Comparable<Person>{
    int height;
    String name;

    public Person(int height, String name) {
        this.height = height;
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
        return this.height - person.height;
    }

    @Override
    public String toString() {
        return name;
    }
}
