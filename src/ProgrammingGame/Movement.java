package ProgrammingGame;

public class Movement {
    private static int currentColumn = 0;
    private static int currentRow = 0;
    private String player = "[*]";
    private String emptyCell = "[ ]";

    public void placePlayer(String[][] gameField) {
        gameField[currentColumn][currentRow] = player;
    }

    public void moveDown(String[][] gameField, String _obstacle) {
        int nextColumn = currentColumn + 1;
        if (nextColumn < gameField.length
                && !gameField[nextColumn][currentRow+1].equals(_obstacle)) {

            System.out.println(currentColumn);
            gameField[currentColumn][currentRow] = emptyCell;
            currentColumn = nextColumn;
            currentRow++;
            gameField[currentColumn][currentRow] = player;
        }
    }

    public void moveUp(String[][] gameField, String _obstacle) {
        int nextColumn = currentColumn - 1;
        if (nextColumn >= 0
                && !gameField[nextColumn][currentRow].equals(_obstacle)) {
            System.out.println(currentColumn);
            gameField[currentColumn][currentRow] = emptyCell;
            currentColumn = nextColumn;
            gameField[currentColumn][currentRow] = player;
        }
    }

    public void moveRight(String[][] gameField, String _obstacle) {
        int nextRow = currentRow + 1;
        if (nextRow < gameField.length
                && !gameField[currentColumn][nextRow].equals(_obstacle)) {
            System.out.println(currentRow);
            gameField[currentColumn][currentRow] = emptyCell;
            currentRow = nextRow;
            gameField[currentColumn][currentRow] = player;
        }
    }

    public void moveLeft(String[][] gameField, String _obstacle) {
        int nextRow = currentRow - 1;
        if (nextRow >= 0
                && !gameField[currentColumn][nextRow].equals(_obstacle)) {
            System.out.println(currentRow);
            gameField[currentColumn][currentRow] = emptyCell;
            currentRow = nextRow;
            gameField[currentColumn][currentRow] = player;
        }
    }

}
