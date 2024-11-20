package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
     return left [left.length -1] == right [right.length -1];

    }
    public static void main(String[] args) {
        int [] left1 = new int [] {9,8,7,6};
        int [] right1 = new int [] {4,2,8,5};
        boolean result = EqualLast.check(left1,right1);
        System.out.println(result);

    }
}