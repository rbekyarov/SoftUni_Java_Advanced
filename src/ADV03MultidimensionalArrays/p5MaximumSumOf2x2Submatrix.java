package ADV03MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class p5MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputRowColumns = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = inputRowColumns[0];
        int columns = inputRowColumns[1];
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            int[] inputData = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = inputData[j];
            }
        }
        int maxValue = Integer.MIN_VALUE;
        int[][] maxSubMatrix = new int[2][2];
        for (int row = 0; row < rows - 1; row++) {
            for (int column = 0; column < columns - 1; column++) {
                int sum = matrix[row][column] + matrix[row][column + 1] +
                        matrix[row + 1][column] + matrix[row + 1][column + 1];
                if (sum > maxValue) {
                    maxValue = sum;
                    maxSubMatrix[0][0] = matrix[row][column];
                    maxSubMatrix[0][1] = matrix[row][column + 1];
                    maxSubMatrix[1][0] = matrix[row + 1][column];
                    maxSubMatrix[1][1] = matrix[row + 1][column + 1];
                }
            }
        }
        for (int i = 0; i < maxSubMatrix.length; i++) {
            for (int j = 0; j < maxSubMatrix[1].length; j++) {
                System.out.print(maxSubMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maxValue);
    }
}
