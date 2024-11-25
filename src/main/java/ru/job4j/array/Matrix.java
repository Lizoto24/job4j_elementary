package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                table[i-1][j-1] = i * j;
            }
        }
        return table;
    }
    public static void main(String[] args) {
        int size = 9;
        int [] [] result = Matrix.multiple(size);
        System.out.println(Arrays.deepToString(result));
    }
}