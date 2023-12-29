package laba5;

import java.util.Scanner;

public class Palindrome {
    static Scanner sc = new Scanner(System.in);

    static boolean isPalindrome(String msg) {
        if (msg.isEmpty() || msg.length() == 1) return true;
        else {
            if (msg.charAt(0) != msg.charAt(msg.length() - 1)) return false;
            else return isPalindrome(msg.substring(1, msg.length() - 1));
        }
    }

    public static void main(String[] args) {
        String text = sc.nextLine();
        System.out.printf("'%s' %s palindrome", text, ((isPalindrome(text.replaceAll("[ !@#$%^&*(){}/.,<>?;'№:]+", "").toLowerCase())) ? "is" : "is NOT"));
    }
}
