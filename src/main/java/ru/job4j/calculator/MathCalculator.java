package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)+
               multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumSubtractionAndDivision(40, 50));
        System.out.println("Результат расчета равен: " + sumAllOperations(8, 7));
    }
    public static double sumSubtractionAndDivision (double first, double second) {
        return subtraction(first,second) +
                division (first,second);
    }
    public static double sumAllOperations (double first, double second) {
        return sum(first, second)+
                multiply(first, second)+
                subtraction(first,second) +
                division (first,second);
    }
}
