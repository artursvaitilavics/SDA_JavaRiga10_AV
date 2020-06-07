package LoopTasks;

public class Task03 {
    //Print x odd numbers starting from y

    public void ForLoop(int x, int y) {
        System.out.println("Foor Loop");
        for (int i = 0; i < x; i++) {
            System.out.println(y);
            y += 2;
        }
    }

    public void WhileLoop(int x, int y) {
        System.out.println("While Loop");
        int count = 0;
        while (count < x) {
            System.out.println(y);
            y += 2;
            count++;
        }
    }

    public void DoWhileLoop(int x, int y) {
        System.out.println("Do-while Loop");
        int count = 0;
        do {
            System.out.println(y);
            y += 2;
            count++;
        } while (count < x);
    }
}
