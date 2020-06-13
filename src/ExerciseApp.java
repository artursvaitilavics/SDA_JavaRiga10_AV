import Arrays.Task001;
import LoopTasks.*;

import java.util.Scanner;

public class ExerciseApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter letter: ");
        String userInput = scanner.nextLine();
////////////////////////////////////////////////////////////////////////////////////////////////

        //TASKS Group 2 - Arrays//
        Task001 task001 = new Task001();
        task001.getIndex(userInput);

    }
}
