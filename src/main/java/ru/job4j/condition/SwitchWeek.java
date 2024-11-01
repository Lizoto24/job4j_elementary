package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Mistake";
        }
        return name;
    }
    public static void main(String[] args) {
    String result = SwitchWeek.nameOfDay(1);
    System.out.println (result);
    String result2 = SwitchWeek.nameOfDay(2);
    System.out.println (result2);
    String result3 = SwitchWeek.nameOfDay(3);
    System.out.println (result3);
    String result4 = SwitchWeek.nameOfDay(4);
    System.out.println (result4);
    String result5 = SwitchWeek.nameOfDay(5);
    System.out.println (result5);
    String result6 = SwitchWeek.nameOfDay(6);
    System.out.println (result6);
    String result7 = SwitchWeek.nameOfDay(7);
    System.out.println (result7);
    String result8 = SwitchWeek.nameOfDay(100);
    System.out.println (result8);
    }
}
