package ru.job4j.array;

import java.util.Arrays;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int index = 0; index < prefix.length; index++) {
            if (prefix[index] != word[index]) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
       char [] word1 = new  char [] {'п', 'р', 'и', 'в', 'е', 'т'};
       char [] prefix1 = new char [] {'п', 'р', 'е'};
       boolean result = ArrayChar.startsWith (word1, prefix1);
    }
}