package ProgrammingGame;

public class Movement {
    private static int currentRow = 0;
    private static int currentColumn = 2;
    private String player = "[*]";
    private String emptyCell = "[ ]";

    public void placePlayer(String[][] gameField) {
        gameField[currentRow][currentColumn] = player;
    }

    public void moveDown(String[][] gameField, String _obstacle) {
        int nextRow = currentRow + 1;
        if (nextRow < gameField.length
                && !gameField[nextRow][currentColumn].equals(_obstacle)) {
            gameField[currentRow][currentColumn] = emptyCell;
            currentRow = nextRow;
            gameField[currentRow][currentColumn] = player;
        }
    }

    public void moveUp(String[][] gameField, String _obstacle) {
        int nextColumn = currentRow - 1;
        if (nextColumn >= 0
                && !gameField[nextColumn][currentColumn].equals(_obstacle)) {
            gameField[currentRow][currentColumn] = emptyCell;
            currentRow = nextColumn;
            gameField[currentRow][currentColumn] = player;
        }
    }

    public void moveRight(String[][] gameField, String _obstacle) {
        int nextRow = currentColumn + 1;
        if (nextRow < gameField.length
                && !gameField[currentRow][nextRow].equals(_obstacle)) {
            gameField[currentRow][currentColumn] = emptyCell;
            currentColumn = nextRow;
            gameField[currentRow][currentColumn] = player;
        }
    }

    public void moveLeft(String[][] gameField, String _obstacle) {
        int nextRow = currentColumn - 1;
        if (nextRow >= 0
                && !gameField[currentRow][nextRow].equals(_obstacle)) {
            gameField[currentRow][currentColumn] = emptyCell;
            currentColumn = nextRow;
            gameField[currentRow][currentColumn] = player;
        }
    }

}
