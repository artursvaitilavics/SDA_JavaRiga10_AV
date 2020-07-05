package sda.hmwork.exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int sum;
        System.out.println("Please enter a number: ");

        try {
            System.out.println("User input: " + scanner.nextInt());
        } catch (InputMismatchException inputException) {
            try {
                System.out.println("User input: " + scanner.nextDouble());
            } catch (InputMismatchException inpMism) {
                System.out.println("Hey, that ain't no number!");
            }
        } finally {
            scanner.close();
        }
    }
}
