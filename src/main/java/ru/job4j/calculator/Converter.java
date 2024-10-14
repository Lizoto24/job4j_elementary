package ru.job4j.calculator;

public class Converter {
    public static int rubleToEuro(int value) {
        int result = value / 70;
        return result;
    }

    public static int rubleToDollar(int value) {
        int result = value / 60;
        return result;
    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
      int dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + dollar + " dollar.");

       int input = 180;
       int expected = 3;
       int output = Converter.rubleToDollar(input);
       boolean passed = expected == output;
       System.out.println("180 rubles are 3. Test result : " + passed);
    }
}

