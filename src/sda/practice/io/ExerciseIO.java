package sda.practice.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseIO {
    public static void main(String[] args) {

        File file = new File("C:/Users/Arturs/Documents/tmpExerc.txt");
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(file))) {
            String fileContent = "";
            String lines;
            int countWords = 0;
            while ((lines = bufferedReader.readLine()) != null) {
                String[] stringCount = lines.trim().split(" ");
                countWords+=stringCount.length;
            }
            System.out.println(countWords);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
