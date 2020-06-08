import LoopTasks.*;

import java.util.Scanner;

public class ExerciseApp {

    public static void main(String[] args) {
        //////////////////////////XYZ Inputs/////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please eneter X: ");
        int x = scanner.nextInt();
        System.out.println("Please eneter Y: ");
        int y = scanner.nextInt();
//        System.out.println("Please eneter Z: ");
//        int z = scanner.nextInt();
////////////////////////////////////////////////////////////////////////////////////////////////
        //TASKS//

        Task08 task = new Task08();
        task.forLoop(x, y);
        task.whileLoop(x, y);
        task.doWhileLoop(x, y);
    }
}
