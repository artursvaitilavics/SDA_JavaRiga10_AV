import LoopTasks.Taks01;
import LoopTasks.Task02;
import LoopTasks.Task03;
import LoopTasks.Task04;

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

        Task04 task04 = new Task04();
        task04.ForLoop(x,y);
        task04.WhileLoop(x,y);
        task04.DoWhileLoop(x,y);
    }
}
