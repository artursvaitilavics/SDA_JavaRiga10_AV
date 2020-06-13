import LoopTasks.*;

import java.util.Scanner;

public class ExerciseApp {

    public static void main(String[] args) {
        //////////////////////////XYZ Inputs/////////////////////////////////////////////////////
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please eneter X: ");
//        int x = scanner.nextInt();
//        System.out.println("Please eneter Y: ");
//        int y = scanner.nextInt();
//        System.out.println("Please eneter Z: ");
//        int z = scanner.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please maximum denominator: ");
        int maxDenominator = scanner.nextInt();
////////////////////////////////////////////////////////////////////////////////////////////////
        //TASKS//

        Task11 task = new Task11();
        task.forLoop(maxDenominator);
        task.whileLoop(maxDenominator);
        task.doWhileLoop(maxDenominator);
    }
}
