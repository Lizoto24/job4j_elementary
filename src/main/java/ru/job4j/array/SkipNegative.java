package ru.job4j.array;

import java.util.Arrays;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int val = array[i][j];
                if (val < 0) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int [][] array = new int [][] {{-6, 3}, {- 8, 16}, {9, 32}};
        int [][] result = SkipNegative.skip(array);
        System.out.println(Arrays.deepToString(result));

    }
}