package LoopTasks;

public class Task05 {

    //Print x numbers that are divided by y
    // without a remainder starting from z
    // ( z also can be divided without a remainder )

    //x/y reizes printeet z/y
    public void ForLoop(int x, int y, int z) {
        System.out.println("For Loop: ");
        x = x / y;
        for (int i = 0; i < x; i++) {
            z = z / y;
            System.out.println(z);
        }
    }

    public void WhileLoop() {
        System.out.println("While Loop: ");
    }

    public void DoWhileLoop() {
        System.out.println("DoWhile Loop: ");
    }
}
