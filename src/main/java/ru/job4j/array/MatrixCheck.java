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
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board [row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            result [row] = board [row][row];
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

        int column = 2;
        char[][] board1 =  new char [][]{
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}};
        boolean result1 = MatrixCheck.monoVertical(board1,2);
        System.out.println(result1);

        char[][] board2 =  new char [][]{
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}};
        char [] result2 = MatrixCheck.extractDiagonal(board2);
        System.out.println(result2);

    }
}
