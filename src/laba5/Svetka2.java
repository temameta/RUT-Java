package laba5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Svetka2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(degree(s, 0, 0));
    }

    static int degree(String text, double base, int degree) {
        Pattern pattern = Pattern.compile("[0-9.0-9]+");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            if (base == 0) {
                base = Double.parseDouble(matcher.group());
                return degree(text.substring(text.indexOf(matcher.group()) + (matcher.group()).length()), base, degree);
            }
            degree = Integer.parseInt(matcher.group());
            return (int) Math.pow(base, degree);
        }
        return 0;
    }
}
