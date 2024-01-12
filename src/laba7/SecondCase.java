package laba7;

import java.util.Scanner;

public class SecondCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чётное кол-во столбцов и строчек:");
        String input = scanner.nextLine();
        if (input.matches("[\\d]+")) {
            int rang = Integer.parseInt(input);
            if (rang % 2 == 0 && rang > 0) {
                System.out.println("Введите матрицу:");
                String[] inputCombination = scanner.nextLine().split(" ");
                if (inputCombination.length > rang * rang - 1) {
                    int[][] matrix = new int[rang][rang];
                    int index = 0, sumOfFirstQuarter = 0, sumOfSecondQuarter = 0, sumOfThirdQuarter = 0, sumOfFourthQuarter = 0;
                    try {
                        for (int i = 0; i < rang; i++) {
                            for (int j = 0; j < rang; j++) {
                                matrix[i][j] = Integer.parseInt(inputCombination[index]);
                                index++;
                            }
                        }
                        for (int i = 0; i < rang / 2; i++) {
                            for (int j = 0; j < rang / 2; j++) {
                                sumOfFirstQuarter += matrix[j][i];
                            }
                        }
                        for (int i = rang / 2; i < rang; i++) {
                            for (int j = 0; j < rang / 2; j++) {
                                sumOfSecondQuarter += matrix[j][i];
                            }
                        }
                        for (int i = 0; i < rang / 2; i++) {
                            for (int j = rang / 2; j < rang; j++) {
                                sumOfThirdQuarter += matrix[j][i];
                            }
                        }
                        for (int i = rang / 2; i < rang; i++) {
                            for (int j = rang / 2; j < rang; j++) {
                                sumOfFourthQuarter += matrix[j][i];
                            }
                        }
                        System.out.println("Сумма первой четверти: " + sumOfFirstQuarter);
                        System.out.println("Сумма второй четверти: " + sumOfSecondQuarter);
                        System.out.println("Сумма третьей четверти: " + sumOfThirdQuarter);
                        System.out.println("Сумма четвёртой четверти: " + sumOfFourthQuarter);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный ввод");
                    }
                } else System.out.println("Чисел меньше, чем надо");
            } else System.out.println("Не делится на 2 или меньше нуля");
        } else System.out.println("Неверный ввод");
    }
}

