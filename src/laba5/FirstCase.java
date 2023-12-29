package laba5;

import java.util.Scanner;

public class FirstCase {
    static double perimeter(int xO, int yO, int xM, int yM) {
        return 2 * Math.PI * Math.sqrt(Math.pow(xM - xO, 2) + Math.pow(yM - yO, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 21, xO, yO, xM, yM;
        xO = Integer.parseInt(sc.nextLine()) * N;
        yO = Integer.parseInt(sc.nextLine()) * N;
        xM = Integer.parseInt(sc.nextLine()) * N;
        yM = Integer.parseInt(sc.nextLine()) * N;
        System.out.printf("%.2f", perimeter(xO, yO, xM, yM));
    }
}
