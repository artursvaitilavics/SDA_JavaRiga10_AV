package GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    Random random = new Random();

    public int randomNumber() {
        int value = random.nextInt(3);
        return value;
    }

    public int getUserGuess(Scanner scanner) {
        int userGuess;
        System.out.println("Guess the number: ");
        userGuess = scanner.nextInt();
        return userGuess;
    }
    public void compareAndPrintNumbers(int userGuess, int mysticalNumber) {
        if (userGuess > mysticalNumber) {
            System.out.println("Too high, try again.");
        } else if (userGuess < mysticalNumber) {
            System.out.println("Too low, try again.");
        } else {
            System.out.println("You might be Jedi!");
        }
    }
}
