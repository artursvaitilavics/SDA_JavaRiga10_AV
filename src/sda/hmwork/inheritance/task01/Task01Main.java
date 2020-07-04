package sda.hmwork.inheritance.task01;

public class Task01Main {
    public static void main(String[] args) {
        Student student001 = new Student(5);
        student001.setName("Billy");
        student001.setSurname("Doodly");
        student001.setAge(33);

        Student student002 = new Student(8);
        student002.setName("Meggy");
        student002.setSurname("Rugby");
        student002.setAge(22);

        Student student003 = new Student(1);
        student003.setName("Frodo");
        student003.setSurname("Baggins");
        student003.setAge(55);

        Teacher teacher01 = new Teacher();
        teacher01.setName("Albus");
        teacher01.setSurname("Dumbledore");
        teacher01.setAge(120);


        //////////////////print teacher////////
        printTeacherAndClassroom(teacher01);

        //////////add student to class, and print teacher now//////////////
        teacher01.setStudents(student001);
        printTeacherAndClassroom(teacher01);


        /////what ever is commented above!!! :D
        teacher01.setStudents(student002);
        printTeacherAndClassroom(teacher01);

    }


    //you know why this is here!
    public static void printTeacherAndClassroom(Teacher teacher) {
        System.out.println(teacher.toString());
        System.out.println("\nHave this students in class: ");
        for (Student student :
                teacher.getStudents()) {
            System.out.println(student.toString());
        }
    }
}
