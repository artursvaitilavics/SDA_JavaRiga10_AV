package Arrays;

import java.util.Arrays;

public class Task002 {
    //2. Write a method that will create a copy of array.
    //   ```
    //   Demonstrate that when you created a copy of array changing an element in one array will not be reflected in a copy.
    //   For example:
    //   int[] x = ...
    //   int[] y = createCopy(x)
    //   x[0] = 1
    //   y[0] = 2
    //   if (x[0] == y[0]) {
    //        // This is an error
    //   }
    //   ```

    public int[] array01 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public int[] array02 = new int[array01.length];

    public void copyArray(int[] arrayFrom, int[] arrayTo) {
        System.out.println("Copy an array:");
        for (int i = 0; i < arrayFrom.length; i++) {
            arrayTo[i] = arrayFrom[i];
        }
    }

    public void printArrays(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(" " + array[i]);
//        }
        System.out.println(Arrays.toString(array));

        System.out.println();
    }

    public void changeAt(int element, int value) {
        System.out.println("Change last element at: ");
        if (element > array02.length - 1) {
            return;
        }
        this.array02[element] = value;
    }
}
