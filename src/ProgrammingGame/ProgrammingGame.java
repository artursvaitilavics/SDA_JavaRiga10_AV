package ProgrammingGame;

import java.util.Scanner;

public class ProgrammingGame {



    ;

    public static void main(String[] args) {
        //8. Now we need to implement method that will ask user to enter commands and return the commands in a useful way.
        //     1. We can ask user to enter only one command or multiple commands separated by comma.
        //     2. Each command is only one word `up`, `down`, `left` or `right`.
        //     3. User is allowed to enter multiple commands separated by comma: `up,down,down,left`.
        //     4. The method should return array of commands.


        Scanner scanner = new Scanner(System.in);

        int gameFieldSize;
        int yPos;
        int xPos;


        do {
            System.out.println("Please chose game field size: ");
            gameFieldSize = scanner.nextInt();
        } while (gameFieldSize <= 2);


        GameField gameField = new GameField(gameFieldSize, gameFieldSize);
        PlayerMove playerMove = new PlayerMove(0, 0);
        EndLevel endLevel = new EndLevel();
        PlayerMoveConditions playerMoveConditions = new PlayerMoveConditions();


        do {
            System.out.println("\nPlease chose a move: ");
            String move = scanner.nextLine();

            playerMoveConditions.playerMoveConditions(move);

            yPos = PlayerMoveConditions.yPos;
            xPos = PlayerMoveConditions.xPos;

            playerMove.movePlayer(yPos, xPos);

            if (endLevel.targetReached(yPos, xPos)) {
                System.out.println("\n\nLevel Complete!");
                gameField.printGameField();
                break;
            } else {
                gameField.printGameField();
            }

        } while (true);

    }

}

