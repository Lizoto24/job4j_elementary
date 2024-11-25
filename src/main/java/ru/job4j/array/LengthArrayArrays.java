package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{96}, {7, 63}, {6, 14, 19},{101, 78, 0, 5 }};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Размер вложенного массива равен: " + array[i].length);
        }
    }
}
