package laba3;

import java.util.Scanner;

public class SumOfPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, enter = 0, N = 21;
        do {
            sum += enter;
            enter = Integer.parseInt(sc.nextLine());
        } while (enter >= 0 && enter < N);
        System.out.println(sum);
        sc.close();
    }
}
