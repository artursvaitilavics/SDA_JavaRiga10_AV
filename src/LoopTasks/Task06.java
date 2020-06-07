package LoopTasks;

public class Task06 extends Helpers {
    //Print Fibonacci Sequence for numbers less than x

    @Override
    public void forLoop(int x) {
        super.forLoop(x);
        int fib1;
        int fib2 = 1;
        for (int i = 0; i <= x; i = fib1 + fib2) {
            System.out.print(" " + i);
            fib1 = fib2;
            fib2 = i;
        }
        System.out.println();
    }

    @Override
    public void whileLoop(int x) {
        super.whileLoop(x);
        int fib1;
        int fib2 = 1;
        int fibio = 0;
        while (fibio <= x) {
            System.out.print(" " + fibio);
            fib1 = fib2;
            fib2 = fibio;
            fibio = fib1 + fib2;
        }
        System.out.println();
    }

    @Override
    public void doWhileLoop(int x) {
        super.doWhileLoop(x);
        int fib1;
        int fib2 = 1;
        int fibio = 0;
        do {
            System.out.print(" " + fibio);
            fib1 = fib2;
            fib2 = fibio;
            fibio = fib1 + fib2;
        } while (fibio <= x);
        System.out.println();
    }
}
