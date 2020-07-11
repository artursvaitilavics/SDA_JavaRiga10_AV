package sda.practice.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


//Set Tasks
//1. Create a set consisting of colors given from the user.
//2. Present the removal of individual elements from the set.
//3. Display the collection before and after sorting.


public class SetTask01 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        String input = "";
        String operation = "remove";
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("add color: ");
            input = scanner.nextLine();
            if ("exit".equals(input)) {
                System.out.println(colors.toString());
                break;
            } else if (input.equals("remove")) {
                System.out.println("which element: ");
                input = scanner.nextLine();
                colors.remove(input);
                System.out.println(colors.toString());
            } else {
                colors.add(input);
                System.out.println(colors.toString());
            }
        }
    }
}
