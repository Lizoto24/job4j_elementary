package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int index = 1; index <= number; index++) {
            System.out.println(result);
            result = result * index;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(calculate(5));
    }
}

