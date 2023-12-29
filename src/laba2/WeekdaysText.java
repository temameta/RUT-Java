package laba2;

import java.util.Scanner;

public class WeekdaysText {
    public static void main(String[] args) {
        String information, day;
        Scanner sc = new Scanner(System.in);
        day = sc.nextLine();
        information = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "workday";
            case "Saturday", "Sunday" -> "holiday";
            case "Понедельник", "Вторник", "Среда", "Четверг", "Пятница" -> "будний день";
            case "Воскресенье", "Суббота" -> "выходной день";
            default -> "invalid weekday";
        };
        System.out.println(information);
        sc.close();
    }
}
