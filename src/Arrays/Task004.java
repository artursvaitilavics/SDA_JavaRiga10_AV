package Arrays;

public class Task004 {
    //4. Write a program to find the maximum and minimum
    // value of a String array.
    // Use `s1.compareTo(s2)`
    // to find which string is greater
    // (`s1` and `s1` has type `String`)
    //   ```
    //   Be sure to use s1.compareTo(s2) for comparison
    //   Array ["e", "b", "c", "a", "d"].
    //   Maximal is "e", Minimal is "a"
    //   ```

    public void compareStrings(String[] inputString) {
        String maximal = inputString[0];
        String minimal = inputString[0];

        for (int i = 1; i < inputString.length; i++) {
            if (maximal.compareTo(inputString[i]) > 0){
                //do stuff
                maximal = inputString[i];
            }
            if (minimal.compareTo(inputString[i]) < 0){
                minimal = inputString[i];
            }
        }

        System.out.println("Maximal is " + "\"" + maximal + "\", "
                + "Minimal is " + "\"" + minimal + "\"");

    }
}
