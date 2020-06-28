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
        //8. Now we need to implement method that will ask user to enter commands and return the commands in a useful way.
        //     1. We can ask user to enter only one command or multiple commands separated by comma.
        //     2. Each command is only one word `up`, `down`, `left` or `right`.
        //     3. User is allowed to enter multiple commands separated by comma: `up,down,down,left`.
        //     4. The method should return array of commands.


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
        EndLevel endLevel = new EndLevel();


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

            if (endLevel.targetReached(yPos, xPos)) {
                System.out.println("\n\nLevel Complete!");
                gameField.printGameField();
                break;
            } else {
                gameField.printGameField();
            }

        } while (true);

    }

}

