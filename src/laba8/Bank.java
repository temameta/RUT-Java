package laba8;

import java.util.Scanner;

public class Bank {
    public static BankAccount[] accounts = new BankAccount[100];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("end")) {
            switch (input) {
                case "Create":
                    BankAccount account = new BankAccount();
                    //accounts[account]
                    break;
                case "Add Deposit \\d \\d":
                    System.out.println("bebrus");
                    break;
                default:
                    System.out.println("s");
                    break;
            }
        }
    }
    private void createAccount() {

    }
}
