
import Arrays.Task005;

public class ExerciseApp {

    public static void main(String[] args) {
        String[] array = {"e", "b", "b", "a", "e", "c", "a", "e", "d"};
        String[] arrayWords = {"kartupelis", "kartupelis",
                "kotlete", "merce",
                "kartupelis", "gurki",
                "merce", "merce"};


        //Task 05

        Task005 task005 = new Task005();

        System.out.println("String array: ");
        task005.printArray(arrayWords);
        System.out.println();
        String[] array2 = task005.removeDuplicates(arrayWords);
        System.out.println("String array contains: ");
        task005.printArray(array2);

    }
}
