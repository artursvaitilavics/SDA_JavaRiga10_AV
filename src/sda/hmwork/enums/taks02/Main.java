package sda.hmwork.enums.taks02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek;
        Scanner scanner = new Scanner(System.in);
        String userInputString;
        int userInputInt;

        System.out.println("Please type name of the week");
        userInputString = scanner.nextLine();
        System.out.println("Please enter a number" +
                " in a range 1-7 including: ");
        userInputInt = scanner.nextInt();

        System.out.println(DayOfWeek.valueOf(userInputString.toUpperCase()));
        System.out.println(DayOfWeek.values()[userInputInt - 1]);


        if (DayOfWeek.values()[userInputInt - 1] ==
                DayOfWeek.valueOf(userInputString.toUpperCase())) {
            System.out.println("You entered same day!");
        }
    }
}
