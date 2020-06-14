package Arrays;

public class Task003 extends Task002 {
    //Task03-Task06
    //3. Write following methods:
    //    1. Add an element to array at the end.
    //    2. Add an element to array at specific index.
    //    3. Remove array element from specific index.
    //    NOTE: Arrays themselves cannot be changed. So you will need to create a new array each time.
    //    ```
    //   int[] x = int[0];
    //   x = addElement(x, 1);
    //   // check that x[0] == 1
    //   x = addElement(x, 2, 0);
    //   // check that x[0] == 2
    //   // check that x[1] == 1
    //   x = deleteElement(x, 0) // delete element at index 0
    //   // check that x.length == 1
    //   // check that x[0] == 1
    //   ```

    //Just to not repeat code typing:
    Task002 methods = new Task002();


    public int[] addLast(int[] inputArray, int value) {
        System.out.println("Add element at the end");
        int[] array = copyArray(inputArray);
        array[array.length - 1] = value;
        return array;
    }

    public int[] addAt(int[] inputArray, int index, int value) {
        System.out.println("Add element at specific index.");
        int[] array = new int[inputArray.length + 1];
        int arrayIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (arrayIndex == index) {
                array[arrayIndex] = value;
                arrayIndex++;
                array[arrayIndex] = inputArray[i];
            } else {
                array[arrayIndex] = inputArray[i];
            }
            arrayIndex++;
        }
        return array;
    }

    public int[] removeAt(int[] inputArray, int index) {
        System.out.println("Remove element from specific index");
        int[] array = new int[inputArray.length-1];
        int arrayIndex = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i == index) {
                i++;
                array[arrayIndex] = inputArray[i];
            } else {
                array[arrayIndex] = inputArray[i];
            }
            arrayIndex++;
        }
        return array;
    }

    //Heleper methods
    private int[] copyArray(int[] inputArray) {
        int[] array = new int[inputArray.length + 1];
        for (int i = 0; i < inputArray.length; i++) {
            array[i] = inputArray[i];
        }
        return array;
    }
//
//    public int[] addAt(int[] inputArray, int index, int value){
//        int array[] = new int[inputArray.length+1];
//
//    }
}
