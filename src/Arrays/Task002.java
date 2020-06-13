package Arrays;

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

    public int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public int[] arrayCopy = new int[myArray.length];

    public void copyArray(){
        arrayCopy = myArray.clone();
    }

    public void printArrays(int[] array){
        System.out.println("Array: " + array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    public void changeElement(int element, int value){
        if (element > arrayCopy.length-1){
            return;
        }
        this.arrayCopy[element] = value;
    }
}
