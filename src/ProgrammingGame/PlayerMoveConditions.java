package ProgrammingGame;

public class PlayerMoveConditions {
    public static int yPos = 0;
    public static int xPos = 0;

    public void playerMoveConditions(String _moves) {


        switch (_moves) {
            case "down":
                if (yPos < GameField.gameField.length) {
                    try {
                        if (!GameField.gameField[yPos + 1][xPos].equals(GameField.obstacle)) {
                            yPos++;
                        }
                    } catch (Exception ignored) {
                    }
                }
                break;
            case "up":
                if (yPos > 0) {
                    try {
                        if (!GameField.gameField[yPos - 1][xPos].equals(GameField.obstacle)) {
                            yPos--;
                        }
                    } catch (Exception ignored) {
                    }

                }
                break;
            case "right":
                if (xPos < GameField.gameField.length) {
                    try {
                        if (!GameField.gameField[yPos][xPos + 1].equals(GameField.obstacle)) {
                            xPos++;
                        }
                    } catch (Exception ignored) {
                    }

                }
                break;
            case "left":
                if (xPos > 0) {
                    try {
                        if (!GameField.gameField[yPos][xPos - 1].equals(GameField.obstacle)) {
                            xPos--;
                        }
                    } catch (Exception ignored) {
                    }

                }
                break;
        }
    }
}
