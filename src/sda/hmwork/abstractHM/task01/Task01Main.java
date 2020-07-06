package sda.hmwork.abstractHM.task01;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class Task01Main {
    public static void main(String[] args) {
        Student marija = new Student("Marija", "Female",
                21, "Mathematics", 7);
        Student vlad = new Student("Vlad", "Male",
                30, "Computer science", 8);

        Worker dimitry = new Worker("Dimitry", "Male",
                55, 125_000, "Software architect");
        Worker liene = new Worker("Liene", "Female",
                27, 94_000, "Project coordinator");

        System.out.println(marija.toString());
        marija.reduceMark(2);
        System.out.println(marija.toString());
        marija.terminate();
        System.out.println(marija.toString());

        System.out.println(vlad.toString());
        vlad.reduceMark(1);
        System.out.println(vlad.toString());
        vlad.terminate();
        System.out.println(vlad.toString());

        System.out.println(dimitry.toString());
        dimitry.terminate();
        System.out.println(dimitry.toString());

        System.out.println(liene.toString());
        System.out.println(liene.toString());
    }
}
