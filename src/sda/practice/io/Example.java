package sda.practice.io;

import sun.rmi.runtime.Log;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {
    public static void main(String[] args) throws IOException {
        List<String> stringList = Files.readAllLines(Paths.get("C:\\Users\\Arturs\\Documents\\tmpExerc.txt"));
        int countWords = 0;
        for (String word :
                stringList) {
            countWords += word.split(" ").length;
        }
        System.out.println(countWords);

        //count symbols
        Map<Character, Long> map = new HashMap<>();
        map.put('.', 0L);
        map.put(',', 0L);
        map.put(' ', 0L);

        for (String word :
                stringList) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (map.containsKey(c)) {
                    Long count = map.get(c);
                    map.put(c, count + 1);
                }
            }
        }

        //Select a word, and count how many times it is the text

        int numberOfOccurrences = 0;
        String searchWord = "Bobo";
        for (String lines :
                stringList) {
            String [] words = lines.split(" ");
            //To be continued
        }

    }
}
