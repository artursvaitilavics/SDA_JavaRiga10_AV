package LoopTasks;

public class Task09 extends Helpers {
    //Write a program to print out all Armstrong numbers between x and y.
    // If sum of cubes of each digit of the number is equal to the number itself,
    // then the number is called an Armstrong number.
    // For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )


    @Override
    public void forLoop(int x, int y) {
        super.forLoop(x, y);
        String xString = "" + x;
        String yString = String.valueOf(y);
        int[] armstrongEq = new int[xString.length()];
        int armstrongNumber = 0;
        //TODO : Print only Amrstrong numbers
        for (int i = x; i <=y ; i++) {
            armstrongNumber = 0;
            for (int l = 0; l < xString.length(); l++) {
                String tempString = "" + xString.charAt(l);
                armstrongEq[l] = Integer.parseInt(tempString);
                armstrongNumber = armstrongNumber + armstrongEq[l] * armstrongEq[l] * armstrongEq[l];
                System.out.print(" - " + l);
            }
            if (armstrongNumber == i ){
                System.out.println(armstrongNumber);
            }
        }
//        for (int i = 0; i < xString.length(); i++) {
//            String tempString = "" + xString.charAt(i);
//            armstrongEq[i] = Integer.parseInt(tempString);
//            armstrongNumber = armstrongNumber + armstrongEq[i] * armstrongEq[i] * armstrongEq[i];
//        }
        System.out.println(armstrongNumber);
    }
        //TODO: Get the armstrong thing work in other loops
    @Override
    public void whileLoop(int x, int y) {
        super.whileLoop(x, y);
    }

    @Override
    public void doWhileLoop(int x, int y) {
        super.doWhileLoop(x, y);
    }
}
