package laba4;

import java.util.Scanner;

public class FactorialsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.next());
        int finish = Integer.parseInt(sc.next());
        double sum = 0, N = 21;
        for (int i = start; i <= finish; i++) {
            double factorial = i;
            for (double j = factorial; j > 0; --j) {
                factorial *= j;
            }
            if (i == N) {
                System.out.println(factorial);
                continue;
            }
            sum += factorial;
        }
        System.out.println(sum);
    }
}
