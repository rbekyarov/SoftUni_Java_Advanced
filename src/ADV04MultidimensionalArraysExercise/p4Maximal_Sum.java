package ADV04MultidimensionalArraysExercise;


import java.util.Arrays;
import java.util.Scanner;

public class p4Maximal_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = input[0];
        int col = input[1];
        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            int[] data = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = data[j];
            }
        }
        int[][] subMatrix = new int[3][3];
        int sumMax = Integer.MIN_VALUE;

        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
                        matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2] +
                        matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                if (sum > sumMax) {
                    sumMax = sum;
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
        System.out.println("Sum = "+sumMax);
        for (int[] ints : subMatrix) {
            for (int j = 0; j < subMatrix.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
