package laba1;

import java.util.Scanner;
public class TicketClerk {
    public static void main(String[] args) {
        double cost = 123.45 * 21, discount = 0.95;
        Scanner scanner = new Scanner(System.in);
        int passengers = scanner.nextInt();
        double result = cost * passengers;
        result *= discount;
        System.out.println(result);
        System.out.printf("%.2f", result);
        scanner.close();
    }
}
