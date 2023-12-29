package laba5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondCase {
    static double average(String text, double value, double count) {
        if (text.isEmpty()) return value / count;
        Pattern pattern = Pattern.compile("[-\\d]+");
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        return average(text.substring(text.indexOf(matcher.group()) + (matcher.group()).length()), value + Integer.parseInt(matcher.group().trim()), count + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        double value = 0, count = 0;
        System.out.println(average(text.trim(), value, count));
    }
}
