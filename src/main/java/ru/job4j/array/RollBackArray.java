package ru.job4j.array;

import java.util.Arrays;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result[index] = array[array.length - index -1];
        }
        return result;
    }
    public static void main(String[] args) {
    int [] array1 = new int [] {1, 2, 3, 4};
    int [] result = RollBackArray.rollback(array1);
    System.out.println(Arrays.toString(result));
    }
}


