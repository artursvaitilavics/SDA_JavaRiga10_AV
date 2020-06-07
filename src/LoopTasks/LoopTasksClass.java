package LoopTasks;

public class LoopTasksClass {
    public void Task_01(int x, int y) {
        System.out.println("Task 01 result: ");
        for (int i = 0; i < x; i++) {
            System.out.println(y);
            y++;
        }
    }

    public void Task_02(int x, int y){
        System.out.println("Task 02 result: ");
        for (int i = 0; i < x; i++) {
            System.out.println(y);
            y--;
        }
    }
}
