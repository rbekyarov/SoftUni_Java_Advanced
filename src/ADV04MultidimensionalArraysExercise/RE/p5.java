package ADV04MultidimensionalArraysExercise.RE;

import java.util.Arrays;
import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] dataMatrix = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = dataMatrix;
        }
        String command = scanner.nextLine();
        while (!command.equals("END")) {

            if (commandIsValid(command, matrix)) {
                swapMatrixElement(command, matrix);
                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void swapMatrixElement(String command, int[][] matrix) {
        String[] arr = command.split(" ");
        int row1 = Integer.parseInt(arr[1]);
        int col1 = Integer.parseInt(arr[2]);
        int row2 = Integer.parseInt(arr[3]);
        int col2 = Integer.parseInt(arr[4]);
        int element1 = matrix[row1][col1];
        int element2 = matrix[row2][col2];
        matrix[row1][col1] = element2;
        matrix[row2][col2] = element1;
    }

    private static boolean commandIsValid(String command, int[][] matrix) {
        String[] arr = command.split(" ");
        if (!arr[0].equals("swap")) {
            return false;
        }
        int row1 = Integer.parseInt(arr[1]);
        int col1 = Integer.parseInt(arr[2]);
        int row2 = Integer.parseInt(arr[3]);
        int col2 = Integer.parseInt(arr[4]);

        if (row1 > matrix.length || col1 > matrix[0].length || row2 > matrix.length || col2 > matrix[0].length) {
            return false;
        }
        return true;

    }
}
