package ProgrammingGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        int gameFieldSize = 2;
        String playerBug = "[*]";
        String target = "[$]";
        String obstacle = "[#]";
        String emptyCell = "[ ]";


        do {
            System.out.println("Please chose game field size: ");
            gameFieldSize = scanner.nextInt();
        } while (gameFieldSize <= 2);

        String[][] gameField = createGameField(gameFieldSize, emptyCell);
        Movement playerMovement = new Movement();

        //put a bug at the start of the game field
        playerMovement.placePlayer(gameField);

        //add target
        addTarget(gameFieldSize, gameField, target);

        //place obstacles
        placeObstacles(gameFieldSize, playerBug, target, obstacle, gameField);

        String move = "";
        //Game:
        while (true) {

            System.out.println("Please chose direction to move: ");
            move = scanner.nextLine();
            switch (move) {
                case "up":
                    playerMovement.moveUp(gameField, obstacle);
                    break;
                case "down":
                    playerMovement.moveDown(gameField, obstacle);
                case "left":
                    playerMovement.moveLeft(gameField, obstacle);
                    break;
                case "right":
                    playerMovement.moveRight(gameField, obstacle);
                    break;
            }
            //Initial Print

            printField(gameField);

        }


    }


    private static void placeObstacles(int gameFieldSize, String playerBug, String target, String obstacle, String[][] gameField) {
        Random random = new Random();
        int chanceForObstacle = random.nextInt(gameFieldSize);

        while (chanceForObstacle > 0) {
            int randomRow = random.nextInt((gameFieldSize));
            int randomColumn = random.nextInt((gameFieldSize));
            if (!gameField[randomRow][randomColumn].equals(playerBug)
                    && !gameField[randomRow][randomColumn].equals(target)) {
                gameField[randomRow][randomColumn] = obstacle;
            }
            chanceForObstacle--;
        }
    }

    private static void addTarget(int gameFieldSize, String[][] gameField, String _target) {

        int min = (int) ((gameFieldSize - 1) * 0.75f);
        int range = (gameFieldSize - 1) - min + 1;

        int rand = (int) (Math.random() * range) + min;

        gameField[rand][rand] = _target;
    }

    private static void printField(String[][] testField) {
        for (int i = 0; i < testField.length; i++) {
            for (int j = 0; j < testField.length; j++) {
                System.out.print(testField[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static String[][] createGameField(int size, String _cell) {
        String[][] gameField = new String[size][size];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j] = _cell;
            }
        }
        return gameField;
    }
}
