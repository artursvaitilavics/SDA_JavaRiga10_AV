package Arrays;

public class Task005 {
    //5. Write a method that will keep only unique Strings from String array.
    //    ```
    //   String[] strings =  ...; // ["e", "b", "a", "e", "c", "a", "e", "d"];
    //   strings = removeDuplicats(strings);
    //   ... // strings contains ["e", "b", "c", "a", "d"]
    //    ```

    public String[] removeDuplicates(String[] inputArray) {
        String tempString = inputArray[0];
        String repeatded = "";
        String outputString = tempString;

        for (int i = 0; i < inputArray.length; i++) {
            tempString = inputArray[i];
            for (int j = 0; j < inputArray.length; j++) {
                if (!tempString.equals(inputArray[j])) {
                    if (!outputString.contains(tempString)) {
                        outputString = outputString + inputArray[i];
                    }
                }
            }
        }
        return arrayFromString(outputString);
    }


    private String[] arrayFromString(String string){
        String[] outputStringArray = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            outputStringArray[i] = String.valueOf(string.charAt(i));
        }
        return  outputStringArray;
    }

    public void printArray(String[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(" " + arrayToPrint[i]);
        }
        System.out.println();
    }

}
