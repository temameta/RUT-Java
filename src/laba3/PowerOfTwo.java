package laba3;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degree = 0, power = 1, limit = Integer.parseInt(sc.nextLine());
        while (limit >= power * 2) {
            degree++;
            power *= 2;
        }
        System.out.println(power);
        System.out.println(degree);
        sc.close();
    }
}
