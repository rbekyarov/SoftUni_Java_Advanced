package ADV17ExamPrep;

import java.util.Scanner;

public class p2Formula_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeMatrix = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[sizeMatrix][sizeMatrix];
        int[] P = new int[2];
        getRowColP(matrix, P);
        int playerRow = P[0];
        int playerCol = P[1];
        int[] F = new int[2];
        getRowColF(matrix, F);
        int finalRow = F[0];
        int finalCol = F[1];

        int countCommand = Integer.parseInt(scanner.nextLine());
    }

    private static int[] getRowColF(String[][] matrix, int[] f) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("P")) {
                    f[0] = row;
                    f[1] = col;
                }
            }
        }
        return f;
    }

    private static int[] getRowColP(String[][] matrix, int[] p) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("P")) {
                    p[0] = row;
                    p[1] = col;
                }
            }
        }
        return p;
    }
}


