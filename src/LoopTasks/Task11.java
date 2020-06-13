package LoopTasks;

public class Task11 extends Helpers {
    //Write a program to compute the value of π.
    // Use the maximum denominator (maxDenominator) as the terminating condition.
    // Try maxDenominator of 1000, 10000, 100000, 1000000
    // and compare the PI obtained.
    // π = 4 * ( 1 - 1/3 + 1/5 - 1/7 ... 1/maxDenominator)


    //    User enters maxDenominator = 5.
    //    Expected result: Pi is approximately 3.4666
    //    Explanation: 4 * ( 1 - 1/3 + 1/5 )
    //    User enters maxDenominator = 7.
    //    Expected result: Pi is approximately 2.895238
    //    Explanation: 4 * ( 1 - 1/3 + 1/5 - 1/7 )
    //    ```

    //π = (4/1) - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + (4/13) - (4/15) ...

    @Override
    public void forLoop(int x) {
        super.forLoop(x);
        float pi = 4;
        float nextIndex = 5;
        for (float i = 3; i < x; i += 2) {
            pi = pi - (4 / i) + (4 / nextIndex);
            nextIndex = nextIndex + 2;
        }
        System.out.println(pi);
    }

    @Override
    public void whileLoop(int x) {
        super.whileLoop(x);
    }

    @Override
    public void doWhileLoop(int x) {
        super.doWhileLoop(x);
    }
}
