package ADV04MultidimensionalArraysExercise.RE;

import java.util.Arrays;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sizeMatrix = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = sizeMatrix[0];
        int cols = sizeMatrix[1];

        int[][] matrix = new int[rows][cols];

        fillMatrix(matrix, scanner);

        int[][] subMatrix = new int[3][3];
        int maxValue = Integer.MIN_VALUE;

        printMaxSumOfSubMatrix(matrix, subMatrix, maxValue);
        printSubMatrix(subMatrix);
    }

    private static void printMaxSumOfSubMatrix(int[][] matrix, int[][] subMatrix, int maxValue) {
        int sum = 0;
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[0].length - 2; j++) {
                sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
                        matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2] +
                        matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                if (sum > maxValue) {
                    maxValue = sum;
                    subMatrix[0][0] = matrix[i][j];
                    subMatrix[0][1] = matrix[i][j + 1];
                    subMatrix[0][2] = matrix[i][j + 2];
                    subMatrix[1][0] = matrix[i + 1][j];
                    subMatrix[1][1] = matrix[i + 1][j + 1];
                    subMatrix[1][2] = matrix[i + 1][j + 2];
                    subMatrix[2][0] = matrix[i + 2][j];
                    subMatrix[2][1] = matrix[i + 2][j + 1];
                    subMatrix[2][2] = matrix[i + 2][j + 2];
                }
            }
        }
        System.out.println("Sum = " + maxValue);
    }

    private static void printSubMatrix(int[][] subMatrix) {
        for (int i = 0; i < subMatrix.length; i++) {
            for (int j = 0; j < subMatrix[0].length; j++) {
                System.out.print(subMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            int[] dataMatrix = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = dataMatrix;
        }
    }
}
