package ProgrammingGame;

import GuessingGame.Game;

public class PlayerMove {
    int xPos = 0;
    int yPos = 0;
    int previousXPos = 0;
    int previousYPos = 0;
    String player = "[*]";
    String emptyCell = "[ ]";


    public PlayerMove(int rows, int columns) {
        xPos = rows;
        yPos = columns;
        replaceCell(player);
    }

    public void movePlayer(int pos1, int pos2) {
        replaceCell(emptyCell);
        if (pos1 >= 0 && pos1 < GameField.gameField.length) {
            if (GameField.gameField[pos1][pos2].equals(GameField.obstacle)) {
                return;
            } else {
                xPos = pos1;
            }
        }
        if (pos2 >= 0 && pos2 < GameField.gameField.length) {
            if (GameField.gameField[pos1][pos2].equals(GameField.obstacle)) {
                return;
            }else {
                yPos = pos2;
            }
        }
        replaceCell(player);
    }

    private void replaceCell(String emptyCell) {
        GameField.gameField[xPos][yPos] = emptyCell;
    }
}
