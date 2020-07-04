package sda.hmwork.inheritance.taks02;

import sda.hmwork.inheritance.taks02.letters.*;

import java.util.Arrays;
import java.util.Scanner;

public class Task02Main {

    public static void main(String[] args) {
        //TODO: Ask user to enter the text
        String text = "ba";

        Letter[] letters = new Letter[text.length()];
        int codeLength = 0;

        for (int i = 0; i < text.length(); i++) {
            letters[i] = getLetter(text.charAt(i));
            codeLength += letters[i].getLength();
        }

        String[] codes = new String[codeLength];
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].getLength(); j++) {
                codes[j] = letters[i].getCode()[j];
            }
        }
        System.out.println(Arrays.toString(codes));
    }


    static Letter getLetter(char ch) {

        switch (ch) {
            case 'a':
                return new LetterA();
            case 'b':
                return new LetterB();
            default:
                return null;
        }
    }
}
