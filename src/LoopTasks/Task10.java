package LoopTasks;

public class Task10 extends Helpers {
    //Average value of printed value

    @Override
    public void forLoop(int x) {
        super.forLoop(x);
        int fib1;
        int fib2 = 1;
        float average = 0;
        int countLoopps = 0;
        for (int i = 0; i <= x; i = fib1 + fib2) {
            System.out.print(" " + i);
            average = average + i;
            fib1 = fib2;
            fib2 = i;
            countLoopps++;
        }
        System.out.println();
        System.out.println(average / countLoopps);

    }

    @Override
    public void whileLoop(int x) {
        super.whileLoop(x);
        int fib1;
        int fib2 = 1;
        int fibio = 0;
        float average = 0;
        int averageDivider = 0;
        while (fibio <= x) {
            System.out.print(" " + fibio);
            average = average + fibio;
            fib1 = fib2;
            fib2 = fibio;
            fibio = fib1 + fib2;
            averageDivider++;
        }
        System.out.println();
        System.out.println(average/averageDivider);
    }

    @Override
    public void doWhileLoop(int x) {
        super.doWhileLoop(x);
        int fib1;
        int fib2 = 1;
        int fibio = 0;
        float average = 0;
        int averageDivider = 0;
        do {
            System.out.print(" " + fibio);
            average = average + fibio;
            fib1 = fib2;
            fib2 = fibio;
            fibio = fib1 + fib2;
            averageDivider++;
        } while (fibio <= x);
        System.out.println();
        System.out.println(average/averageDivider);
    }
}
