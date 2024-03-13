package laba8;

import java.util.Scanner;

public class Bank {
    public static BankAccount[] accounts = new BankAccount[100];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("end")) {
            String[] inputArr = input.split(" ");
            if (inputArr.length < 1) System.out.println("Неверный ввод");
            else if (input.toLowerCase().matches("[a-z]+")) {
                if (input.equalsIgnoreCase("create")) createAccount();
                else System.out.println("Неверный ввод");
            } else if (input.toLowerCase().matches("[a-z]+ [a-z]+ \\d+")) {
                if ((inputArr[0] + " " + inputArr[1]).equalsIgnoreCase("set interest")) {
                    BankAccount.setInterestRate(Integer.parseInt(inputArr[2]));
                    System.out.println("Changed Interest Rate");
                } else System.out.println("Неверный ввод");
            } else if (input.toLowerCase().matches("[a-z]+ [a-z]+ \\d+ \\d+")) {
                int index = Integer.parseInt(inputArr[2]) - 1, amountOrYears = Integer.parseInt(inputArr[3]);
                if (index >= 0 && index < 100 && amountOrYears > 0)
                    if (accounts[index] != null)
                        switch ((inputArr[0] + " " + inputArr[1]).toLowerCase()) {
                            case "add deposit" -> {
                                accounts[index].deposit(amountOrYears);
                                System.out.printf("Deposited %d to ID%d%n", amountOrYears, index + 1);
                            }
                            case "get interest" -> System.out.println(accounts[index].getInterest(amountOrYears));
                            default -> System.out.println("Неверный ввод");
                        }
                    else System.out.printf("Account ID%d does not exist%n", index + 1);
                else System.out.println("Неверный ввод");
            } else System.out.println("Неверный ввод");
            input = scanner.nextLine();
        }
    }

    private static void createAccount() {
        int currentIndex = 0;
        while (accounts[currentIndex] != null) currentIndex++;
        accounts[currentIndex] = new BankAccount();
        System.out.printf("Account ID%d created%n", currentIndex + 1);
    }
}
