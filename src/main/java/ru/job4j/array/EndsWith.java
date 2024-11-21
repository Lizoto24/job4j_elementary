package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int index = 0; index < postfix.length ; index++) {
            if (postfix[postfix.length - index - 1] != word [word.length - index -1]) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        char [] word1 = new char [] {'п', 'р', 'и', 'в', 'е', 'т'};
        char [] postfix1 = new char [] {'в', 'е', 'т'};
        boolean result = EndsWith.endsWith (word1,postfix1);
        System.out.println(result);
    }

}