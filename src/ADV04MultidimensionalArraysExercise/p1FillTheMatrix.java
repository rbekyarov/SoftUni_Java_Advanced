package ADV04MultidimensionalArraysExercise;

import java.util.Scanner;

public class p1FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String patterns = input[1];
        int[][] matrix = new int[size][size];

        if (patterns.equals("A")) {
            fillMatrixPatternA(matrix);
        } else if (patterns.equals("B")) {
            fillMatrixPatternB(matrix);
        }
        printMatrix(matrix);
    }

    private static int[][] fillMatrixPatternA(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                count++;
                matrix[j][i] = count;
            }
        }
        return matrix;
    }

    private static int[][] fillMatrixPatternB(int[][] matrix) {
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = count++;
                }
            } else {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[j][i] = count++;
                }
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
