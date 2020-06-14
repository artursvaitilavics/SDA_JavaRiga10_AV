
import Arrays.Task002;
import Arrays.Task003;

public class ExerciseApp {

    public static void main(String[] args) {

        //TASKS Group 2 - Arrays//
        Task002 task = new Task002();
        Task003 task003 = new Task003();

        task.copyArray(task.array01,task.array02);
        System.out.println("Original Array: ");
        task.printArrays(task.array01);
        System.out.println("Copy of an original:");
        task.printArrays(task.array02);
        task.changeAt(7,55);
        task.printArrays(task.array02);

        //Task 03:

        int[] array04 = task003.addLast(task.array02,5);
        task.printArrays(array04);

        int[] array05 = task003.addAt(array04,2,11);
        task.printArrays(array05);

        int[] array06 = task003.removeAt(array05, 4);
        task.printArrays(array06);
    }
}
