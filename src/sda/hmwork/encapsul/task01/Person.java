package sda.hmwork.encapsul.task01;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean hasWork;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 0;
    }

    public boolean getHasWork() {
        return hasWork;
    }

    public void setHasWork(boolean hasWork) {
        this.hasWork = hasWork;
    }

    public void grow(){
        this.age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", hasWork=" + hasWork +
                '}';
    }
}
