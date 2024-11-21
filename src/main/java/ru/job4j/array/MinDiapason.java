package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (min > array[index]) {
                min =  array[index];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] array1 = new int [] {6, 79, 85, 32, 21, 3, 99};
        int start = 3;
        int finish = 6;
        int result = MinDiapason.findMin(array1,start,finish);
        System.out.println(result);

    }
}