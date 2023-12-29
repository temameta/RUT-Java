package laba6;

import java.util.Scanner;

public class FirstCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        while (!(inputString.matches("[0-9 -]+"))) {
            System.out.println("Please, try again");
            inputString = sc.nextLine();
        }
        String[] intsInString = inputString.trim().split(" ");
        int[] ints = new int[intsInString.length];
        int count = intsInString.length, sum = 0;
        for (int i = 0; i < intsInString.length; i++) {
            ints[i] = Integer.parseInt(intsInString[i]);
            sum += ints[i];
        }
        System.out.println(sum);
        System.out.println(count);
        String outputString = "";
        for (int i = 1; i < ints.length - 1; i++)
            if (ints[i - 1] > ints[i] && ints[i + 1] > ints[i]) outputString += ints[i]+" ";
        System.out.println(outputString.trim());
    }
}