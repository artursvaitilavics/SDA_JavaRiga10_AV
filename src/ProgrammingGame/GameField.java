package ProgrammingGame;

import java.util.Random;

public class GameField {
    static String[][] gameField;
    static String obstacle = "[#]";
    static int targetPos1 = 0;
    static int targetPos2 = 0;

    String emptyCell = "[ ]";
    String target = "[$]";
    Random random = new Random();


    public GameField(int rows, int columns) {
        gameField = new String[rows][columns];
        setEmptyGameField();
        setObstacles();
        setTarget();
    }


    private void setEmptyGameField() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j] = emptyCell;
            }
        }
    }

    private void setObstacles() {
        int divider;
        for (int i = 0; i < gameField.length; i += 2) {
            for (int j = 0; j < gameField.length; j++) {
                divider = random.nextInt(gameField.length) + 1;
                if (i % divider == 0 && j % divider == 0
                        && (i != 0 || j != 0)) {
                    gameField[i][j] = obstacle;
                }
            }
        }
    }

    private void setTarget() {
        int min = (int) ((gameField.length - 1) * 0.7f);
        int max = gameField.length - 1;

        targetPos1 = random.nextInt((max - min) + 1) + min;
        targetPos2 = random.nextInt((max - min) + 1) + min;

        gameField[targetPos1][targetPos2] = target;

    }

    public void printGameField() {
        for (String[] strings : gameField) {
            System.out.println();
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(strings[j]);
            }
        }
    }
}
