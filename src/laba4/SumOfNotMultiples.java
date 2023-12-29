package laba4;

import java.util.Scanner;

public class SumOfNotMultiples {
    public static void main(String[] args) {
        int sum = 0;
        int N = 21;
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int finish = Integer.parseInt(sc.nextLine());
        for (int i = start; i <= finish; i++) {
            if (i % 3 == 0 || i == N) continue;
            sum+=i;
        }
        System.out.println(sum);
        sc.close();
    }
}
