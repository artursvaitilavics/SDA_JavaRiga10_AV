package LoopTasks;

public class Task08 extends Helpers {
    //Print a powers table for values x - y


    @Override
    public void forLoop(int x, int y) {
        super.forLoop(x, y);
        int yPoerOfX = y;
        for (int i = 0; i < x - 1; i++) {
            yPoerOfX = yPoerOfX * y;
        }
        System.out.print(yPoerOfX);
    }

    @Override
    public void whileLoop(int x, int y) {
        super.whileLoop(x, y);
        int yPoerOfX = y;
        while (x > 1) {
            x--;
            yPoerOfX = yPoerOfX * y;
        }
        System.out.println(yPoerOfX);
    }

    @Override
    public void doWhileLoop(int x, int y) {
        super.doWhileLoop(x, y);
        int yPoerOfX = y;
        do {
            x--;
            yPoerOfX = yPoerOfX * y;
        } while (x > 1);
        System.out.println(yPoerOfX);
    }
}
