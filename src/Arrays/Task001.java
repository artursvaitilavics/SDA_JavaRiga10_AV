package Arrays;

public class Task001 {
    //Write a program to find the index of an array element.
    String[] myArray = {"a", "b", "c", "d", "e", "f"};

    public void getIndex(String element) {
        int index = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (element.equals(myArray[i])) {
                index = i;
                break;
            }
        }
        System.out.println("Find index of \""
                + element +
                "\". Result "
                + index);
    }
}
