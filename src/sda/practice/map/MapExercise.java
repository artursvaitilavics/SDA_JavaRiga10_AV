package sda.practice.map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();
        while (true) {
            try {
                String userInput = new Scanner(System.in).nextLine();
                colors.add(userInput);
            } catch (Exception e) {
                System.out.println("Please enter a String");
            }
            System.out.println(colors.toString());
        }
    }
}
