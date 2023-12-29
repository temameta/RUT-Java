package laba5;

import java.util.Scanner;

public class Voice {
    static void voice(int num) {
        System.out.println(
                switch (num) {
                    case 1 -> "One";
                    case 2 -> "Two";
                    case 3 -> "Three";
                    case 4 -> "Four";
                    case 5 -> "Five";
                    case 6 -> "Six";
                    case 7 -> "Seven";
                    case 8 -> "Eight";
                    case 9 -> "Nine";
                    case 10 -> "Ten";
                    default -> "I'm tired";
                }
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        voice(sc.nextInt());
    }
}
