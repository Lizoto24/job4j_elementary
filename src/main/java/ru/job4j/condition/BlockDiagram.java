package ru.job4j.condition;

public class BlockDiagram {
    public static void number(int A, int B, int C) {
        if (A > B) {
            if (A > C) {
                System.out.println(A);
            } else {
                System.out.println(C);
            }
        } else if (B > C) {
            System.out.println(B);
        } else {
            System.out.println(C);
        }
    }

    public static void main(String[] args) {
        BlockDiagram.number (20,90,48);
    }

}