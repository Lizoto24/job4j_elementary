package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник","Monday" -> 1;
            case "Вторник","Tuesday" -> 2;
            case "Среда","Wednesday" -> 3;
            case "Четверг","Thursday" -> 4;
            case "Пятница","Friday" -> 5;
            case "Суббота","Saturday" -> 6;
            case "Воскресенье","Sunday" -> 7;
            default -> -1;
        };
    }
    public static void main(String[] args) {
        int name = MultipleSwitchWeek.numberOfDay("Понедельник");
        System.out.println (name);
        int name1 = MultipleSwitchWeek.numberOfDay("Tuesday");
        System.out.println (name1);
        int name3 = MultipleSwitchWeek.numberOfDay("Wednesday");
        System.out.println (name3);
        int name4 = MultipleSwitchWeek.numberOfDay("Четверг");
        System.out.println (name4);
        int name5 = MultipleSwitchWeek.numberOfDay("Friday");
        System.out.println (name5);
        int name6 = MultipleSwitchWeek.numberOfDay("Saturday");
        System.out.println (name6);
        int name7 = MultipleSwitchWeek.numberOfDay("Воскресенье");
        System.out.println (name7);
        int name8 = MultipleSwitchWeek.numberOfDay("Осень");
        System.out.println (name8);
    }
}

