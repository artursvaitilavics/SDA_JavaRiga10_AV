package GuessingGame;

import java.util.Scanner;

public class Game {
    public static void runGame(Scanner scanner, Methods methods, int mysticalNumber) {
        int userGuess;
        do {
            try {
                userGuess = methods.getUserGuess(scanner);
                methods.compareAndPrintNumbers(userGuess, mysticalNumber);
            } catch (Exception exception) {
                System.out.println("GAME OVER! \nYou are way too STUPID");
                break;
            }
        } while (userGuess != mysticalNumber);
    }
}
