package ADV04MultidimensionalArraysExercise.RE;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Math.abs(sumPrimary(matrix) - sumSecond(matrix)));
    }

    private static int sumPrimary(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {

                if (row == col) {
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static int sumSecond(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {

                if (col == matrix.length - row - 1) {
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }
}
