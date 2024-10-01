package ru.job4j.calculator;

public class AdvancedCalculator {
    public static void plus(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }


    public static void main(String[] args) {
        AdvancedCalculator.plus(100, 500);
        AdvancedCalculator.plus(4, 2);
        AdvancedCalculator.plus(3, 5);
    }
}