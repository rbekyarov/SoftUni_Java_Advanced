package ADV04MultidimensionalArraysExercise.RE;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int matrixSize = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[matrixSize][matrixSize];

        if (pattern.equals("A")) {
            fillMatrixPatternA(matrix);
        } else {
            fillMatrixPatternB(matrix);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixPatternB(int[][] matrix) {
        int count = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = count++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = count++;
                }
            }
        }
    }

    private static void fillMatrixPatternA(int[][] matrix) {
        int count = 0;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                count++;
                matrix[row][col] = count;
            }
        }
    }
}
