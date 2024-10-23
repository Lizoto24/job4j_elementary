package ru.job4j.condition;

public class Max {
    public static int number(int left, int right) {
        boolean maxNumber = left >= right;
        int result = maxNumber ? left : right;
        return result;
    }
    public static void main(String[] args) {
        int message = Max.number (1,2);
        System.out.println(message);
    }
}

