package sda.hmwork.abstractHM.task01;

public class Student extends Human {
    private String subjectOfStudy;
    private int mark;
    private String isStudent = "Student";

    public Student(
            String name, String gender,
            int age, String subjectOfStudy,
            int mark) {
        super(name, gender, age);
        this.subjectOfStudy = subjectOfStudy;
        this.mark = mark;
    }

    public void reduceMark(int amountToReduce) {
        this.mark -= amountToReduce;
    }

    @Override
    public void terminate() {
        if (this.mark < 6) {
            System.out.println("Grades are too low, " +
                    "student will be expelled");
            isStudent = "Ex student";
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                "\n\t" + isStudent +
                "\n\tSubject of study=" + subjectOfStudy +
                "\n\tmark= " + mark;
    }
}
