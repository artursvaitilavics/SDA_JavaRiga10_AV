package sda.hmwork.inheritance.task01;

import java.util.Arrays;

public class Teacher extends Person {
    private Student[] students;

    public Teacher() {
        this.students = new Student[0];
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        this.students = addStudent(student);
    }

    @Override
    public String toString() {
        return "Teacher:" +
                getName() + " " + getSurname()
                + " \naged " + getAge();
    }

    private Student[] addStudent(Student student) {
        Student[] studentsNew = new Student[this.students.length + 1];
        for (int i = 0; i < this.students.length; i++) {
            studentsNew[i] = this.students[i];
        }
        studentsNew[studentsNew.length - 1] = student;
        return studentsNew;
    }
}
