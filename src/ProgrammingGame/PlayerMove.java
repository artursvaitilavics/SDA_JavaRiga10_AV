package ProgrammingGame;

public class PlayerMove {
    static int xPos = 0;
    static int yPos = 0;
    String player = "[*]";
    String emptyCell = "[ ]";


    public PlayerMove(int rows, int columns) {
        xPos = rows;
        yPos = columns;
        replaceCell(player);
    }

    public void movePlayer(int pos1, int pos2) {
        replaceCell(emptyCell);
        xPos = pos1;
        yPos = pos2;
        replaceCell(player);
    }

    private void replaceCell(String emptyCell) {
        GameField.gameField[xPos][yPos] = emptyCell;
    }
}
