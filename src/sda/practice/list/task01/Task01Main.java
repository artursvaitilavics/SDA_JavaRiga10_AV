package sda.practice.list.task01;

//Lists Task 1
//Create a List and display its result ( data should be provided by the user console
//a) Purchases to be made. If an element already exists on the list, then it s hould
//not be added.
//b) Add to the example above the possibility of "deleting" purchase d elements
//c) Display only those purchases that start with „m” e.g . milk
//d)d)* View only purchases whose next product on the list starts with „m” ( e.g . eggs ,
//if milk was next on the list) (edited)

import java.util.*;

public class Task01Main {
    public static void main(String[] args) {
        List<String> purchaseList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String product = "";
        String operation = "";
        do {
            System.out.println("add, remove, display, display next, exit: ");
            operation = scanner.nextLine();
            switch (operation) {
                case "add":
                    System.out.println("What to buy");
                    product = scanner.nextLine();
                    if (!purchaseList.contains(product)) {
                        purchaseList.add(product);
                    } else {
                        System.out.println("Already in the list");
                    }
                    System.out.println(purchaseList.toString());
                    break;
                case "remove":
                    System.out.println("Which product remove: ");
                    product = scanner.nextLine();
                    purchaseList.remove(product);
                    System.out.println(purchaseList.toString());
                case "display":
                    System.out.println("Display product starting with letter: ");
                    String firstLetter = scanner.nextLine();
                    for (String item :
                            purchaseList) {
                        if (firstLetter.equals(item.startsWith(firstLetter))) {
                            System.out.println(item);
                        }
                    }
                case "display next":
                    System.out.println("Display product before product with first letter: ");
                    firstLetter = scanner.nextLine();

                    for (int i = 0; i < purchaseList.size(); i++) {
                        if (purchaseList.get(i + 1).startsWith(firstLetter)) {
                            System.out.println(purchaseList.get(i));
                        }
                    }
                    break;
                default:
                    break;
            }
        } while (!operation.equals("exit"));

    }

    public static void printList(List<String> purchaseList) {
        System.out.println();
        for (String item :
                purchaseList) {
            System.out.print(item + " ");
        }
        System.out.println("\n\n");
    }
}