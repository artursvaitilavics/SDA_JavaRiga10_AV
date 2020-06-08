package LoopTasks;

public class Task07 extends Helpers {
    //Calculate and print factorial values for first x integers (0 - x)
    //n! = n × (n-1) × (n-2) × (n-3) × ….× 3 × 2 × 1
    //
    @Override
    public void forLoop(int x) {
        super.forLoop(x);
        int fractalNumber = 0;
        for (int i = 0; i <= x; i++) {
            fractalNumber = i;
            for (int j = i - 1; j > 0; j--) {
                fractalNumber = fractalNumber * j;
            }
            System.out.print(" " + fractalNumber);
        }
    }

    @Override
    public void whileLoop(int x) {
        super.whileLoop(x);
        int fractalNumber = 0;
        int counter1 = 0;
        while (counter1 <= x) {
            int counter2 = counter1 - 1;
            fractalNumber = counter1;
            while (counter2 > 0) {
                fractalNumber = fractalNumber * counter2;
                counter2--;
            }
            System.out.print(" " + fractalNumber);
            counter1++;
        }
    }

    @Override
    public void doWhileLoop(int x) {
        super.doWhileLoop(x);
        int fractalNumber = 0;
        int counter1 = 0;
        do {
            int counter2 = counter1 - 1;
            fractalNumber = counter1;
            do {
                fractalNumber = fractalNumber * counter2;
                counter2--;
            } while (counter2 > 0);
            System.out.print(" " + fractalNumber);
            counter1++;
        } while (counter1 <= x);
    }
}
