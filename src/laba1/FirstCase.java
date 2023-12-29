package laba1;

import java.util.Scanner;
public class FirstCase {
    public static void main(String[] args) {
        float a, b, n = 21, res;
        Scanner scanner = new Scanner(System.in);
        a = Float.parseFloat(scanner.next());
        b = Float.parseFloat(scanner.next());
        res = Math.abs(((a - n) / (2 * b)) + ((a * a + b * b * b) / n));
        System.out.printf("%.2f", res);
        scanner.close();
    }
}