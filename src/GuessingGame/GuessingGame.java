package GuessingGame;
//Write a program that generates a random number and asks the user to guess what the number is.
// If the user's guess is higher than the random number, the program should display
// "Too high, try again."
// If the user's guess is lower than the random number, the program should display
// "Too low, try again."
// The program should use a loop that repeats until the user correctly guesses the random number.

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();
        Game game = new Game();

        String userInput = "";
        int userGuess = 0;
        int mysticalNumber = methods.randomNumber();

        game.runGame(scanner, methods, mysticalNumber);
    }
}
