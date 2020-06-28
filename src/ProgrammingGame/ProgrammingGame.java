package ProgrammingGame;

import ProgrammingGame.Methods.EndLevel;
import ProgrammingGame.Methods.GameField;
import ProgrammingGame.Methods.PlayerMove;
import ProgrammingGame.Methods.PlayerMoveConditions;

import java.util.Scanner;

public class ProgrammingGame {
    static int yPos = 0;
    static int xPos = 0;
    static int points = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gameFieldSize;
        boolean gameLoop = true;

        gameFieldSize = getGameFieldSize(scanner);

        GameField gameField = new GameField(gameFieldSize, gameFieldSize);
        PlayerMove playerMove = new PlayerMove(0, 0);
        EndLevel endLevel = new EndLevel();
        PlayerMoveConditions playerMoveConditions = new PlayerMoveConditions();

//////////////////////Game Loop////////////////////////////////////////////////////////////
        while (gameLoop) {
            System.out.println("\nPlease chose a move combination of moves " +
                    "separated by commas: ");

            String[] moves = scanner.nextLine().split(",");
            applyMoves(playerMove, playerMoveConditions, moves);
            gameLoop = isGameFinished(yPos, xPos, gameLoop, gameField, endLevel);
        }
        levelCompleteMessage();
    }

    /////////////////Game Local Methods/////////////////////////////////////

    public static void levelCompleteMessage() {
        String timesPlural = "";
        if (points > 1) {
            timesPlural = "s";
        }
        System.out.println("\n\nLevel Complete!");
        System.out.println("You reached target by typing moves "
                + points
                + " time"
                + timesPlural
                + "!");
    }

    public static void applyMoves(PlayerMove playerMove,
                                  PlayerMoveConditions playerMoveConditions,
                                  String[] moves) {
        points++;
        for (String s : moves) {
            playerMoveConditions.playerMoveConditions(s.toLowerCase());

            yPos = PlayerMoveConditions.yPos;
            xPos = PlayerMoveConditions.xPos;
            playerMove.movePlayer(yPos, xPos);
        }
    }

    public static boolean isGameFinished(int yPos, int xPos,
                                         boolean gameLoop,
                                         GameField gameField,
                                         EndLevel endLevel) {
        if (endLevel.targetReached(yPos, xPos)) {
//            System.out.println("\n\nLevel Complete!");
            gameField.printGameField();
            gameLoop = false;
        } else {
            gameField.printGameField();
        }
        return gameLoop;
    }

    public static int getGameFieldSize(Scanner scanner) {
        int gameFieldSize;
        do {
            System.out.println("Please chose game field size: ");
            gameFieldSize = scanner.nextInt();
        } while (gameFieldSize <= 2);
        return gameFieldSize;
    }

}

