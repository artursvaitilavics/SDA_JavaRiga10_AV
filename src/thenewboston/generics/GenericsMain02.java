package thenewboston.generics;

public class GenericsMain02 {
    public static void main(String[] args) {
        System.out.println(maxValue(23,55,78));
        System.out.println(maxValue("bacon","eggs","sausage"));

    }

    public static <T extends Comparable<T>>
    T maxValue(T value01, T value02, T value03) {
        T max = value01;

        if (value02.compareTo(value01) > 0) {
            max = value02;
        }
        if (value03.compareTo(max) > 0) {
            max = value03;
        }
        return max;
    }
}
