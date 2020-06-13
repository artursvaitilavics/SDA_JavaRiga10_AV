import Arrays.*;

public class ExerciseApp {

    public static void main(String[] args) {
        //TASKS Group 2 - Arrays//
        Task002 task = new Task002();
        task.copyArray();
        task.printArrays(task.myArray);
        task.printArrays(task.arrayCopy);
        task.changeElement(8,55);
        task.printArrays(task.arrayCopy);

    }
}
