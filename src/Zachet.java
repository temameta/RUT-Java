import java.util.Scanner;

public class Zachet {

    // Константы для обозначения символов в массиве
    public static final char P = 'P'; // Точка, где находится пользователь
    public static final char L = 'L'; // Точка перехода на следующий этаж
    public static final char O = 'O'; // Точка, в которую можно сделать шаг
    public static final char F = 'F'; // Конечная точка движения
    public static final char B = 'B'; // Точка, представляющая препятствие
    // Константы для обозначения направлений движения
    public static final char W = 'w'; // Вперед
    public static final char S = 's'; // Назад
    public static final char A = 'a'; // Налево
    public static final char D = 'd'; // Направо
    public static int floor = 0; // Текущий этаж
    public static int row = 2; // Текущая строка
    public static int col = 0; // Текущий столбец
    public static char[][][] flat = {
            {
                    {O, O, O, O, O, O},
                    {O, B, O, O, L, O},
                    {P, O, O, O, O, O},
                    {O, O, B, O, O, O},
                    {O, O, O, O, O, O}
            },
            {
                    {O, O, O, O, O, O},
                    {O, O, B, O, O, O},
                    {L, O, B, O, O, O},
                    {B, O, B, O, O, O},
                    {O, O, O, O, O, O}
            },
            {
                    {O, O, O, O, O, F},
                    {O, O, O, B, O, O},
                    {O, O, O, O, O, O},
                    {O, O, O, O, B, O},
                    {O, B, O, O, O, O}
            },
    };
    // Константы для обозначения размеров массива
    public static final int FLOORS = flat.length; // Количество этажей
    public static final int ROWS = flat[0].length; // Количество строк на каждом этаже
    public static final int COLS = flat[0][0].length; // Количество столбцов на каждом этаже
public static boolean endGame = false;
    public static void main(String[] args) {
        printFlat();
        Scanner scanner = new Scanner(System.in);
        while (!endGame) {
            String inputCombination = scanner.nextLine();
            char[] combination = new char[inputCombination.length()];
            for (int i = 0; i < inputCombination.length(); i++) {
                combination[i] = inputCombination.charAt(i);
            }
            for (int i = 0; i < combination.length; i++) {
                move(combination[i]);
            }
            refreshFlat();
            checkPos();
            printFlat();
        }
    }
    public static void refreshFlat() {
        flat = new char[][][]{
                {
                        {O, O, O, O, O, O},
                        {O, B, O, O, L, O},
                        {O, O, O, O, O, O},
                        {O, O, B, O, O, O},
                        {O, O, O, O, O, O}
                },
                {
                        {O, O, O, O, O, O},
                        {O, O, B, O, O, O},
                        {L, O, B, O, O, O},
                        {B, O, B, O, O, O},
                        {O, O, O, O, O, O}
                },
                {
                        {O, O, O, O, O, F},
                        {O, O, O, B, O, O},
                        {O, O, O, O, O, O},
                        {O, O, O, O, B, O},
                        {O, B, O, O, O, O}
                },
        };
    }
    public static void checkPos() {
        try {
            if (flat[floor][row][col] == F) {
                System.out.println("ПОБЕДА!");
                endGame = true;
                return;
            }
            if (flat[floor][row][col] == L) {
                floor++;
            }
            if (flat[floor][row][col] == B) {
                System.out.println("ТАМ СТОЛБ");
                return;
            }
            flat[floor][row][col] = P;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ТАМ СТЕНА");
        }
    }
    public static void move(char button) {
        if (button == W) row--;
        if (button == A) col--;
        if (button == S) row++;
        if (button == D) col++;
    }

    public static void printFlat() {
        for (int i = 0; i < FLOORS; i++) {
            for (int j = 0; j < ROWS; j++) {
                for (int k = 0; k < COLS; k++) {
                    System.out.print(flat[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}