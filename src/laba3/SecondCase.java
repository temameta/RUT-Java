package laba3;

import java.util.Scanner;

public class SecondCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Integer.parseInt(sc.nextLine()), maxNumber = Integer.MIN_VALUE, number;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(sc.nextLine());
            if (number % 3 != 0) continue;
            if (number > maxNumber) maxNumber = number;
        }
        if (maxNumber != Integer.MIN_VALUE) System.out.println(maxNumber);
        else System.out.println("undefined");
    }
}