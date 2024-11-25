package ru.job4j.array;

import java.util.Arrays;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board [row].length; i++) {
            if (board [row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int row = 2;
        char [][] board = new char [][] { {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}};
        boolean result = MatrixCheck.monoHorizontal(board,2);
        System.out.println(result);
    }
}
