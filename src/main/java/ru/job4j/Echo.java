package ru.job4j;

public class Echo {
        public static double distance(int x1, int y1, int x2, int y2) {
                int a = x2-x1;
                double b = Math.pow(a,2);
                int c = y2-y1;
                double d = Math.pow(c,2);
                double e = b+d;
                double result = Math.sqrt(e);
                return result;
        }

        public static void main(String[] args) {
                double result = Echo.distance(0, 0, 2, 0);
                System.out.println("result (0, 0) to (2, 0) " + result);
        }
}