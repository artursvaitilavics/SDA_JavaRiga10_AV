package LoopTasks;

public class Task05 {

    //Print x numbers that are divided by y
    // without a remainder starting from z
    // ( z also can be divided without a remainder )

    //x/y reizes printeet z/y
    public void ForLoop(int x, int y, int z) {
        System.out.println("For Loop: ");
        for (int i = 0; i < x; i++) {
            System.out.println(z);
            z += y;
        }
    }

    public void WhileLoop(int x, int y, int z) {
        System.out.println("While Loop: ");
        int counter = 0;
        while (counter < x) {
            System.out.println(z);
            z += y;
            counter++;
        }
    }

    public void DoWhileLoop(int x, int y, int z) {
        System.out.println("DoWhile Loop: ");
        int counter = 0;
        do {
            System.out.println(z);
            z += y;
            counter++;
        } while (counter < x);
    }
}
