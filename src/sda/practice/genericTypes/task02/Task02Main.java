package sda.practice.genericTypes.task02;

public class Task02Main {
    public static void main(String[] args) {
        String obj001 = "Some String";
        Integer obj002 = 15;
        Double obj003 = 50.0d;

        Generic<Object> generics[] = new Generic[3];

        generics[0] = new Generic<>(obj001);
        generics[1] = new Generic<>(obj002);
        generics[2] = new Generic<>(obj003);

        ////////////////////////////Another way how to create specific Generic element/////////////////////////
        //        GenericBox<String> stringGenericBox = new GenericBox<>("This is a text");
        //        String item = stringGenericBox.getItem();
        //​
        //        GenericBox<Integer> integerGenericBox = new GenericBox<>(0);
        //        Integer item1 = integerGenericBox.getItem();
        //​
        //        GenericBox<Person> personGenericBox = new GenericBox<>(new Person("Name"));
        //        Person item2 = personGenericBox.getItem();

        for (Generic generic:
             generics) {
            System.out.println(generic.toString());
        }
    }
}


