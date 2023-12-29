package laba3;

import java.util.Scanner;

public class FirstCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 21, number = Integer.parseInt(sc.nextLine());
        while (!((-5 * N <= number && number <= 1 * N) || (5 * N <= number && number <= 10 * N))) {
            System.out.println(("Not_yet"));
            number = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Correct_number_" + number);
        sc.close();
    }
}
