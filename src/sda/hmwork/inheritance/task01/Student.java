package sda.hmwork.inheritance.task01;

public class Student extends Person {
    private int mark;

    public Student(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student:" +
                "\nname: " + getName() +
                "\nsurname: " + getSurname() +
                "\nage: " + getAge() +
                "\nmark: " + mark+ "\n";
    }
}
