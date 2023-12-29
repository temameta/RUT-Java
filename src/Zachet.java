import java.util.Scanner;

public class Zachet {
    public static final char P = 'P'; //польз
    public static final char L = 'L'; //след этаж
    public static final char F = 'F'; //конец
    public static final char B = 'B'; //препятствие
    public static final char O = 'O'; //туда шаг
    public static final char W = 'w'; // Вперед
    public static final char S = 's'; // Назад
    public static final char A = 'a'; // Налево
    public static final char D = 'd'; // Направо

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            String inputCombination = scanner.nextLine();
            char[] combination = new char[inputCombination.length()];
            int[] currentPos = {0, 2, 0};
            for (int i = 0; i < inputCombination.length(); i++) {
                combination[i] = inputCombination.charAt(i);
            }
            for (int i = 0; i < combination.length; i++) {
                char[][][] flat = {
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
                int[] nextPos = press(combination[i], currentPos);
                try {
                    char trych = flat[nextPos[0]][nextPos[1]][nextPos[2]];
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ERROR");
                    break;
                }
                if (flat[nextPos[0]][nextPos[1]][nextPos[2]] == F) {
                    done = true;
                    System.out.println("Victory!");
                    break;
                }
                if (flat[nextPos[0]][nextPos[1]][nextPos[2]] == O) {
                    currentPos = nextPos;
                }
                if (flat[nextPos[0]][nextPos[1]][nextPos[2]] == L) {
                    currentPos = nextPos;
                    currentPos[0]++;
                }
                if (flat[nextPos[0]][nextPos[1]][nextPos[2]] == B) {
                    System.out.println("ПРИШЛИ В 'B'");
                    break;
                }
                flat[currentPos[0]][currentPos[1]][currentPos[2]] = P;
                System.out.println(combination[i]);
                printMatrix(flat);
            }
        }
    }

    public static int[] press(char button, int[] currentPos) {
        if (button == W) return new int[]{currentPos[0], currentPos[1] - 1, currentPos[2]};
        if (button == A) return new int[]{currentPos[0], currentPos[1], currentPos[2] - 1};
        if (button == S) return new int[]{currentPos[0], currentPos[1] + 1, currentPos[2]};
        if (button == D) return new int[]{currentPos[0], currentPos[1], currentPos[2] + 1};
        return new int[]{};
    }

    public static void printMatrix(char[][][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < matrix[0][0].length; k++) {
                    System.out.print(matrix[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}