import LoopTasks.LoopTasksClass;

import java.util.Scanner;

public class ExerciseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please eneter X: ");
        int x = scanner.nextInt();
        System.out.println("Please eneter Y: ");
        int y = scanner.nextInt();
//        System.out.println("Please eneter Z: ");
//        int z = scanner.nextInt();

        LoopTasksClass task01 = new LoopTasksClass();
        task01.Task_01(x, y);
    }
}
