package laba7;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        String[] array = scanner.nextLine().split(" ");
        scanner.close();
        String[][] matrix = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = array[i * m + j];
            }
        }
        String[][] reverse = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                reverse[n - i - 1][j] = matrix[n][m];
            }
        }
        printMatrix(matrix);
        printMatrix(reverse);
    }
    static void printMatrix (String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
