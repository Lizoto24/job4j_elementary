package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min > array[index]){
                min = array [index];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] array1 = new int [] {9, 6, 27, 96};
        int result = Min.findMin(array1);
        System.out.println(result);


    }

}