package laba2;

import java.util.Scanner;

public class SecondCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 21;
        double kg, price;
        String month, fruit, monthFlag;
        fruit = sc.nextLine().toLowerCase();
        month = sc.nextLine().toLowerCase();
        kg = Double.parseDouble(sc.nextLine());
        monthFlag = switch (month) {
            case "march", "april", "may", "september", "october", "november" -> "true";
            case "january", "february", "june", "july", "august", "december" -> "false";
            default -> "invalid";
        };
        price = switch (fruit) {
            case "apple" -> 9.99 * n * kg;
            case "plum" -> 10.98 * n * kg;
            case "banana" -> 11.49 * n * kg;
            case "grapes" -> 15.99 * n * kg;
            case "orange" -> 17.99 * n * kg;
            case "kiwi" -> 37.99 * n * kg;
            case "mango" -> 39.99 * n * kg;
            default -> -1;
        };
        if (monthFlag.equals("true") && price != -1) System.out.printf("%.2f", price * 1.05);
        else System.out.println("INVALID");
        sc.close();
    }
}