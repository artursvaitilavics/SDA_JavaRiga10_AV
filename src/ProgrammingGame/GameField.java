package ProgrammingGame;

import java.util.Random;

public class GameField {
    static String[][] gameField;
    static String obstacle = "[#]";
    String emptyCell = "[ ]";
    String target = "[$]";
    Random random = new Random();


    public GameField(int rows, int columns) {
        gameField = new String[rows][columns];
        setEmptyGameField();
        setObstacles();
        setTarget();
    }


    private String[][] setEmptyGameField() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j] = emptyCell;
            }
        }
        return gameField;
    }

    private String[][] setObstacles() {
        int divider = 0;
        for (int i = 0; i < gameField.length; i += 2) {
            for (int j = 0; j < gameField.length; j++) {
                divider = random.nextInt(gameField.length) + 1;
                if (i % divider == 0 && j % divider == 0
                        && (i != 0 || j != 0)) {
                    gameField[i][j] = obstacle;
                }
            }
        }
        return gameField;
    }

    private String[][] setTarget() {
        int min = (int) ((gameField.length - 1) * 0.7f);
        int max = gameField.length - 1;

        int randomCoordinate01 = random.nextInt((max - min) + 1) + min;
        int randomCoordinate02 = random.nextInt((max - min) + 1) + min;

        gameField[randomCoordinate01][randomCoordinate02] = target;

        return gameField;

    }

    public void printGameField() {
        for (int i = 0; i < gameField.length; i++) {
            System.out.println();
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j]);
            }
        }
    }
}
