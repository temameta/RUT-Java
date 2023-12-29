package laba1;

import java.util.Scanner;
public class SecondCase {
    public static void main(String[] args) {
        String nachStroka, lastStroka;
        char symbol;
        int index;
        Scanner scanner = new Scanner(System.in);
        nachStroka = scanner.nextLine();
        index = Integer.parseInt(scanner.next());
        symbol = scanner.next().charAt(0);
        lastStroka = nachStroka.substring(0, index) + symbol + nachStroka.substring(index + 1, nachStroka.length());
        lastStroka = lastStroka.toUpperCase();
        System.out.println(lastStroka);
        scanner.close();
    }
}