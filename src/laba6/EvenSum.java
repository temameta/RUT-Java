package laba6;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        int[] numbers = new int[words.length];
        int sum = 0, sumOfN = 0, N = 21;
        for (int i = 0; i < words.length; i++)
            numbers[i] = Integer.parseInt(words[i]);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) sum += numbers[i];
            if (numbers[i] % N == 0) sumOfN += numbers[i];
        }
        System.out.println(sum);
        System.out.println(sumOfN);
    }
}
