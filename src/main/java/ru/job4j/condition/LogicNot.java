package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean isNegative(int num) {
        if (num == 0) {
            return false;
        } else {
            return !isPositive(num);
        }
    }
    public static boolean notEvenAndPositive(int num) {
        return notEven (num) && isPositive (num);
    }

    public static boolean evenOrNegative(int num) {
        return isEven(num)  || isNegative(num);
    }
    public static void main(String[] args) {
       boolean result = LogicNot.isEven(2);
       System.out.println(result);
       boolean result1 = LogicNot.isPositive(4);
       System.out.println(result1);
       boolean result3 = LogicNot.notEven (3);
       System.out.println(result3);
       boolean result4 = LogicNot.isNegative(8);
       System.out.println(result4);
       boolean result5 = LogicNot.notEvenAndPositive(7);
       System.out.println(result5);
       boolean result6 = LogicNot.evenOrNegative(-2);
       System.out.println(result6);
    }
}
