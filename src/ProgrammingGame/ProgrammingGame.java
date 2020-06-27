package ProgrammingGame;

import GuessingGame.Game;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ProgrammingGame {

    public enum moves {
        DOWN,
        UP,
        RIGHT,
        LEFT
    }

    ;

    public static void main(String[] args) {
        //1. Define a field - 2d array. Select appropriate type.
        //2. Write method to print 2D array.
        //3. Initialize array - fill whole array with empty symbols.
        // for example you can use spaces. Test that printing works OK.
        //4. Write method that will put a bug at the start position. Test that it works.
        //5. Write method that will randomly put a target
        // (preferably on the farthest part of a field). Test that it works.
        //6. Write method that will randomly put some number of obstacles. Note obstacles should not be put on player or target.
        //    Don't bother with unsolvable cases where there is not possible way to get a bug to a target for now. Test this method.


        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        int gameFieldSize = 2;
        int yPos = 0;
        int xPos = 0;


        do {
            System.out.println("Please chose game field size: ");
            gameFieldSize = scanner.nextInt();
        } while (gameFieldSize <= 2);


        GameField gameField = new GameField(gameFieldSize, gameFieldSize);
        PlayerMove playerMove = new PlayerMove(0, 0);


        do {
            System.out.println("\nPlease chose a move: ");
            String _moves = scanner.nextLine();

            switch (_moves) {
                case "down":
                    if (yPos < GameField.gameField.length) {
                        try {
                            if (!GameField.gameField[yPos + 1][xPos].equals(GameField.obstacle)) {
                                yPos++;
                            }
                        } catch (Exception e) {
                        }
                    }
                    break;
                case "up":
                    if (yPos > 0) {
                        try {
                            if (!GameField.gameField[yPos - 1][xPos].equals(GameField.obstacle)) {
                                yPos--;
                            }
                        } catch (Exception e) {
                        }

                    }
                    break;
                case "right":
                    if (xPos < GameField.gameField.length) {
                        try {
                            if (!GameField.gameField[yPos][xPos + 1].equals(GameField.obstacle)) {
                                xPos++;
                            }
                        } catch (Exception e) {
                        }

                    }
                    break;
                case "left":
                    if (xPos > 0) {
                        try {
                            if (!GameField.gameField[yPos][xPos - 1].equals(GameField.obstacle)) {
                                xPos--;
                            }
                        } catch (Exception e) {
                        }

                    }
                    break;
            }

            playerMove.movePlayer(yPos, xPos);
            gameField.printGameField();

        } while (true);

    }

}

