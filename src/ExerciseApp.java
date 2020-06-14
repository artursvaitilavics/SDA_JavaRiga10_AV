
import Arrays.Task005;

public class ExerciseApp {

    public static void main(String[] args) {
        String[] array = {"e", "b", "b", "a", "e", "c", "a", "e", "d"};


        //Task 05

        Task005 task005 = new Task005();

        System.out.println("String array: ");
        task005.printArray(array);
        System.out.println();
        String[] array2 = task005.removeDuplicates(array);
        System.out.println("String array contains: ");
        task005.printArray(array2);

    }
}
