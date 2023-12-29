package laba6;

import java.util.Scanner;

public class SecondCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] string1 = sc.nextLine().split(" "), string2 = sc.nextLine().split(" "), strings = new String[string1.length + string2.length];
        boolean isSorted = false;
        String buf = "", outputString = "";
        int count = 0;
        for (int i = 0; i < string1.length; i++) {
            strings[i] = string1[i];
            count++;
        }
        for (String s : string2) strings[count++] = s;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < strings.length - 1; i++)
                if (strings[i].length() > strings[i + 1].length()) {
                    isSorted = false;
                    buf = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = buf;
                }
        }
        for (int i = 0; i < strings.length; i++)
            for (int j = i + 1; j < strings.length; j++)
                if (strings[j].equals(strings[i])) strings[i] = "";
        for (String s : strings) {
            if (s.isEmpty() || s.equals(" ")) continue;
            outputString += s + " ";
        }
        System.out.println(outputString.trim());
    }
}
