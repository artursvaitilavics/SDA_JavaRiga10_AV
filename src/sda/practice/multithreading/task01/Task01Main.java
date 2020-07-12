package sda.practice.multithreading.task01;

public class Task01Main {
    public static void main(String[] args) {
        Thread object001 = new Thread(new MyThreadingClass("First thread"));
        MyThreadingClass object002 = new MyThreadingClass("Second thread");
        MyThreadingClass object003 = new MyThreadingClass("Third thread");

        object001.start();
        new Thread(object002).run();
        new Thread(object003).run();


    }
}
