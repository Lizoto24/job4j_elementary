package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = new int[]{5, 10, 15};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        System.out.println(result);

        int[] data1 = new int[]{6, 7, 9, 17, 35, 89, 92, 64, 78, 92, 47};
        int element1 = 92;
        int start = 3;
        int finish = 9;
        int result1 = FindLoop.indexInRange(data1, element1, start, finish);
        System.out.println(result1);
    }

}


