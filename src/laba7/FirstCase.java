package laba7;

import java.util.Scanner;

public class FirstCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.next());
        int columns = Integer.parseInt(scanner.next());
        int[][] arr = new int[rows][columns];
        int a = 1;
        int count = 1;
        int start = 0;
        for (int i = columns - 1; i > -1; i--) {
            a *= -1;
            start = Math.abs(start - (rows-1));
            int end = Math.abs(start - (rows - 1));
            for (int j = start; j != end + a; j+=a) {
                arr[j][i] = count++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
