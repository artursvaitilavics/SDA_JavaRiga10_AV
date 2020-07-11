package sda.hmwork.interfaces.task01;

import java.util.Arrays;

public class Process implements Queue {
    private int[] myArray;

    private static int count = 0;

    public Process(int length) {
        this.myArray = new int[length];
    }

    @Override
    public void add(int element) {
        //if all elements are busy, create new array twice the length
        //move all the elements from small to big one
        count++;
        int currentLenght = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = element;
                return;
            } else if (count == myArray.length + 1) {
                currentLenght = myArray.length;
                break;
            }
        }

        if (currentLenght == myArray.length) {
            myArray = Arrays.copyOf(myArray, myArray.length * 2);
            myArray[currentLenght] = element;
        }
    }

    @Override
    public void remove() {
        //remove first element in the list
//        myArray[0] = 0;
        // move all elements by one unit to the beginning
        for (int i = 1; i < myArray.length; i++) {
            myArray[i - 1] = myArray[i];
        }
        myArray = Arrays.copyOf(myArray, myArray.length - 1);
    }

    @Override
    public boolean isEmpty() {
        for (int element :
                myArray) {
            if (element != 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}
