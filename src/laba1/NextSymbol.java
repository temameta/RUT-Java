package laba1;

import java.util.Scanner;
public class NextSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        System.out.println((char)(symbol+21));
        scanner.close();
    }
}