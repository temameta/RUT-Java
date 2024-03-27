package laba9;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Какая задача?");
        switch (scanner.nextLine().trim().toLowerCase()) {
            case "book" -> book();
            case "airplane" -> airplane();
            default -> System.out.println("huh?");
        }
    }

    public static void airplane() {
        int engineNumber, wingsCount, passengers;
        boolean isHydroplane;
        System.out.println("Введите информацию о самолёте в формате: {кол-во пассажиров} {кол-во крыльев} {кол-во двигателей} {есть ли возможность сесть на воду?}");
        try {
            String[] string = scanner.nextLine().trim().split(" ");
            passengers = Integer.parseInt(string[0]);
            engineNumber = Integer.parseInt(string[1]);
            wingsCount = Integer.parseInt(string[2]);
            isHydroplane = string[3].equalsIgnoreCase("true");
            Airplane airplane = new Airplane(passengers, wingsCount, engineNumber, isHydroplane);
            System.out.println(airplane);
        } catch (NumberFormatException e) {
            System.out.println("Number Error");
        } catch (IllegalArgumentException e) {
            System.out.println(e.fillInStackTrace());
        }

    }

    public static void book() {
        String title = scanner.nextLine(), author = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());

        Book samplebook = new Book(title, author, price);
        Book goldenEditionBook = new GoldenEditionBook(title, author, price);

        System.out.println(samplebook);
        System.out.println(goldenEditionBook);
    }
}

