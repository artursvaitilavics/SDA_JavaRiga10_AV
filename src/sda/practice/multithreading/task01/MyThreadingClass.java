package sda.practice.multithreading.task01;

import java.sql.SQLOutput;

public class MyThreadingClass implements Runnable {
    private int value = 1;
    private String name;

    public MyThreadingClass(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (value < 10) {
                System.out.println(name + "Says Hello " + value);
                Thread.sleep(1000);
                modifyValue();
            }
        } catch (Exception e) {
            System.out.println("Some error!");
        }
    }

    private int modifyValue() {
        return value++;
    }
}
