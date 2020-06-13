package LoopTasks;

public class Task12 extends Helpers {
    //Write a program that extracts each digit from an `x`, in the reverse order.
    //    ```
    //    User enters x = 15423. Expected output: "3 2 4 5 1", with a space separating the digits.
    //    User enters x = 6485. Expected output: "5 8 4 6", with a space separating the digits.
    //    ```


    @Override
    public void forLoop(int x) {
        super.forLoop(x);
        String xString = String.valueOf(x);
        int[] userInputArray = new int[x];
        for (int i = xString.length() - 1; i >= 0; i--) {
            userInputArray[i] = Integer.parseInt(String.valueOf(xString.charAt(i)));
            System.out.print(userInputArray[i] + " ");
        }
    }

    @Override
    public void whileLoop(int x) {
        super.whileLoop(x);
        String xString = String.valueOf(x);
        int[] userInputArray = new int[x];
        int counter = xString.length() - 1;
        while (counter >= 0) {
            userInputArray[counter] = Integer.parseInt(String.valueOf(xString.charAt(counter)));
            System.out.print(userInputArray[counter] + " ");
            counter--;
        }
    }

    @Override
    public void doWhileLoop(int x) {
        super.doWhileLoop(x);
        String xString = String.valueOf(x);
        int[] userInputArray = new int[x];
        int counter = xString.length() - 1;
        do {
            userInputArray[counter] = Integer.parseInt(String.valueOf(xString.charAt(counter)));
            System.out.print(userInputArray[counter] + " ");
            counter--;
        } while (counter >= 0);
    }
}
