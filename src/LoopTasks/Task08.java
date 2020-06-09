package LoopTasks;

public class Task08 extends Helpers {
    //Print a powers table for values x - y


    @Override
    public void forLoop(int x, int y) {
        super.forLoop(x, y);
        int tempValue = x;
        for (int j = x; j <= y; j++) {
            tempValue = j;
            for (int i = x; i <= y; i++) {
                System.out.print(" " + tempValue);
                tempValue = tempValue * j;
            }
            System.out.println();
        }
    }

    @Override
    public void whileLoop(int x, int y) {
        super.whileLoop(x, y);
        int counter1 = x;
        int counter3 = x;
        int yPoerOfX = x;

        while (counter3 <= y) {
            yPoerOfX = counter3;
            counter1 = y;
            while (counter1 > 1) {
                System.out.print(" " + yPoerOfX);
                yPoerOfX = yPoerOfX * counter3;
                counter1--;
            }
            counter3++;
            System.out.println();
        }

    }

    @Override
    public void doWhileLoop(int x, int y) {
        super.doWhileLoop(x, y);
        int yPoerOfX = x;
        int counter1 = x;
        int counter2 = x;

        do {
            counter1 = x;
            yPoerOfX = counter2;
            do {
                System.out.print(" " + yPoerOfX);
                yPoerOfX = yPoerOfX * counter2;
                counter1++;
            } while (counter1 <= y);
            System.out.println();
            counter2++;
        } while (counter2 <= y);
    }
}
