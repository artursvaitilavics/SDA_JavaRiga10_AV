package ProgrammingGame;

public class EndLevel {
    int targetPos1;
    int targetPos2;

    public EndLevel() {
        targetPos1 = GameField.targetPos1;
        targetPos2 = GameField.targetPos2;
    }

    public boolean targetReached(int pos1, int pos2) {
        if (pos1 == targetPos1 && pos2 == targetPos2) {
            return true;
        } else {
            return false;
        }
    }
}
