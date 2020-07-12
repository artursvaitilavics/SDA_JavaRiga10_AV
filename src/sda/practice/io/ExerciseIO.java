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
            while ((lines = bufferedReader.readLine()) != null) {
                System.out.println(lines);
                fileContent+= lines;
            }
            String[] stringCount = fileContent.trim().split(" ");
            System.out.println(stringCount.length);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
