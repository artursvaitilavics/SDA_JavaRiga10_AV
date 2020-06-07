package LoopTasks;

public class Task02 {
    public void ForLoop(int x, int y) {
        System.out.println("For loop result: ");
        for (int i = 0; i < x; i++) {
            System.out.println(y);
            y--;
        }
    }

    public void WhileLoop(int x, int y) {
        System.out.println("While loop result: ");
        while (x > 0) {
            System.out.println(y);
            x--;
            y--;
        }
    }

    public void DoWhileLoop(int x, int y) {
        System.out.println("Do-while loop result: ");
        do {
            System.out.println(y);
            y--;
            x--;
        } while (x > 0);
    }
}
