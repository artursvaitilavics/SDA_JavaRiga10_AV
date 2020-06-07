import LoopTasks.*;

import java.util.Scanner;

public class ExerciseApp {

    public static void main(String[] args) {
        //////////////////////////XYZ Inputs/////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please eneter X: ");
        int x = scanner.nextInt();
//        System.out.println("Please eneter Y: ");
//        int y = scanner.nextInt();
//        System.out.println("Please eneter Z: ");
//        int z = scanner.nextInt();
////////////////////////////////////////////////////////////////////////////////////////////////
        //TASKS//

        Task06 task06 = new Task06();
        task06.ForLoop(x);
        task06.WhileLoop(x);
        task06.DoWhileLoop(x);
    }
}
