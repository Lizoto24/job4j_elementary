package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double semiPerimeter = (a+b+c)/2;
        double triangleArea = semiPerimeter * (semiPerimeter - a)*(semiPerimeter - b)*(semiPerimeter - b);
        double result = Math.sqrt(triangleArea) ;
        return result;
    }

    public static void main(String[] args) {
        double result = TriangleArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
