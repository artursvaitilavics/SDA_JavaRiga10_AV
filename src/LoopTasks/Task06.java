package LoopTasks;

public class Task06 extends Helpers {
    //Print Fibonacci Sequence for numbers less than x

    public int[] fibonacciArray(int arrayLength) {
        int[] fibio = new int[arrayLength];
        int fib1 = 0;
        int fib2 = 1;
        for (int i = 0; i < fibio.length; i++) {
            fibio[i] = fib1;
            int fibichio = fib2 + fib1;
            fib1 = fib2;
            fib2 = fibichio;
        }
        return fibio;
    }

    @Override
    public void ForLoop(int x) {
        super.ForLoop(x);
        int fib1 = 0;
        int fib2 = 1;
        for (int i = 0; i <= x; i=fib2) {
            System.out.println(fib1);
            int fibonacciTemp = fib2 + fib1;
            fib1 = fib2;
            fib2 = fibonacciTemp;//
        }
    }

    @Override
    public void WhileLoop(int x) {
        super.WhileLoop(x);
    }

    @Override
    public void DoWhileLoop(int x) {
        super.DoWhileLoop(x);
    }
}
