package thenewboston.generics;

public class GenericsMain01 {
    public static void main(String[] args) {
        Integer[] inArray = {5, 6, 3, 7, 4, 8};
        Character[] charArray = {'a', 'g', 'p', 'r', 'b'};

        printMe(inArray);
        printMe(charArray);
    }

    //Generic method
    public static <T> void printMe(T[] array) {
        for (T item :
                array) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }
}
