package sda.hmwork.interfaces.task01;

import org.omg.CORBA.ARG_IN;

import java.util.Arrays;

public class Task01Main {
    public static void main(String[] args) {

        Process process = new Process(2);
        System.out.println("Array is empty: " + process.isEmpty());

        process.add(20);
        process.add(11);

        System.out.println(process.toString());
        process.add(33);
        System.out.println(process.toString());

        process.add(77);
        process.add(15);
        process.add(100);
        process.add(66);
        process.add(90);
        System.out.println(process.toString());
        process.add(44);
        System.out.println(process.toString());

        process.remove();
        System.out.println(process.toString());

//        int counter = 0;
//        while (counter < 50000) {
//            process.add(counter * 5);
//            counter++;
//        }
//        System.out.println(process.toString());


        System.out.println("Array is empty: " + process.isEmpty());
    }
}
