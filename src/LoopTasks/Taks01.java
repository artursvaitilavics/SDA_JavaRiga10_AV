package LoopTasks;

public class Taks01 {
    public void Task01ForLoop(int x, int y) {
        System.out.println("Task 01 for loop result: ");
        for (int i = 0; i < x; i++) {
            System.out.println(y);
            y++;
        }
    }

    public void Task01WhileLoop(int x, int y) {
        System.out.println("Task 01 while loop result: ");
        while (x > 0) {
            System.out.println(y);
            x--;
            y++;
        }
    }

    public void Task01DoWhileLoop(int x, int y) {
        System.out.println("Task 01 do-while loop result: ");
        do {
            System.out.println(y);
            y++;
            x--;
        } while (x > 0);
    }
}
