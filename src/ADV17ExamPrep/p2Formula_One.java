package ADV17ExamPrep;

import java.util.Map;
import java.util.Scanner;

public class p2Formula_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeMatrix = Integer.parseInt(scanner.nextLine());
        int countCommand = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[sizeMatrix][sizeMatrix];
        fillMatrix(matrix, scanner);
        int[] P = new int[2];
        getRowColP(matrix, P);
        int playerRow = P[0];
        int playerCol = P[1];
        int[] F = new int[2];
        getRowColF(matrix, F);
        int finalRow = F[0];
        int finalCol = F[1];

        while (countCommand-->0){
            String command = scanner.nextLine();
            switch (command){

                case "up":

                    break;

                case "down":

                    break;

                case "left":

                    break;

                case "right":

                    break;
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String[] input = scanner.nextLine().split("");
            for (int column = 0; column < matrix[1].length; column++) {
                matrix[row][column] = input[column];
            }
        }
    }

    private static int[] getRowColF(String[][] matrix, int[] f) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("F")) {
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


