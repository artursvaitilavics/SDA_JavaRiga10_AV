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
        int limit = y - x;
        while (y > limit) {
            System.out.println(y);
            y--;
        }
    }

    public void DoWhileLoop(int x, int y) {
        System.out.println("Do-while loop result: ");
        int limit = y - x;
        do {
            System.out.println(y);
            y--;
        } while (y > limit);
    }
}
