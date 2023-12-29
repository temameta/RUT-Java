package laba4;

import java.util.Scanner;

public class FirstCase {
    public static void main(String[] args) {
        int sumOfPrimes = 0, productOfNonPrime = 1, N = 21;
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        while (!(inputString.equalsIgnoreCase("stop"))) {
            int inputNumber = Integer.parseInt(inputString);
            if (inputNumber > 1 && inputNumber != N) {
                boolean flag = true;
                for (int i = 2; i < Math.sqrt(inputNumber); i++) {
                    if (inputNumber % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) productOfNonPrime *= inputNumber;
                else sumOfPrimes += inputNumber;
            } else System.out.println("invalid");
            inputString = sc.nextLine();
        }
        if (sumOfPrimes != 0) System.out.println("prime_" + sumOfPrimes);
        else System.out.println("prime_undefined");
        if (productOfNonPrime != 1) System.out.println("non_prime_" + productOfNonPrime);
        else System.out.println("non_prime_undefined");
    }
}
