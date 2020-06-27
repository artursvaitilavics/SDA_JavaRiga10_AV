package ProgrammingGame;

public class GameField {
    String[][] gameField;

    public GameField(int rows, int columns) {
        gameField = new String[rows][columns];
    }

    private void printGameField() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                System.out.println(gameField[i][j]);
            }
        }
    }
}
