package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data [index] != data [0]) {
                result=false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean [] data1 = new boolean [] {true,true,true};
        boolean result = Check.mono(data1);
        System.out.println(result);
    }
}
