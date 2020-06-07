import LoopTasks.Taks01;
import LoopTasks.Task02;

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
//        Taks01 task01 = new Taks01();
//        task01.Task01ForLoop(x, y);
//        task01.Task01WhileLoop(x, y);
//        task01.Task01DoWhileLoop(x, y);

        Task02 task02 = new Task02();
        task02.ForLoop(x, y);
        task02.WhileLoop(x, y);
        task02.DoWhileLoop(x, y);
    }
}
