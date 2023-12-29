package laba6;

import java.util.Scanner;

public class ReversePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];
        String outputString = "";
        for (int i = 0; i < numbers.length; i++) {
            int digit = Integer.parseInt(sc.nextLine());
            numbers[i] = digit;
        }
        for (int i = numbers.length - 1; i >= 0; i--)
            outputString += numbers[i] + " ";
        System.out.println(outputString.trim());
    }
}
