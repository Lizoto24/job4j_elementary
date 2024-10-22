package ru.job4j.condition;

public class Code {
    public static int number(int A, int B, int C) {
        if (A > B) {
            if (A > C) {
                return (A);
            } else {
                return (C);
            }
        } else if (B > C) {
            return (B);
        } else {
            return (C);
        }
    }
    public static void main(String[] args) {
       int result = Code.number (20,90,48);
       System.out.println("Самое большое число  "   +result);
    }
}

