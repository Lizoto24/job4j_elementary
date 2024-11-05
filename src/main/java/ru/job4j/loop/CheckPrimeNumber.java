package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number==1) {return false;}
        boolean prime = true;
        for (int index = 2; index <= number-1; index++) {
            if (number % index == 0) {prime=false;
                break;}
        }
        return prime;
    }
    public static void main(String[] args) {
        System.out.println(check(7));
        System.out.println(check(6));
    }
}