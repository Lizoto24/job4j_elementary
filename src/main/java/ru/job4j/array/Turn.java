package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length/2 ; index++) {
            int temp = array[index];
            array [index] = array [array.length - 1 - index];
            array [array.length - 1 - index] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
      int [] array1 = new int [] {4,1,6,2};
      int [] result = Turn.back(array1);
      System.out.println(Arrays.toString(result));
    }
}
