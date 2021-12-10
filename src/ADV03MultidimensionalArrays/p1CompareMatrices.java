package ADV03MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class p1CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = createMatrix(scanner);
        addElementInMatrix(matrix1, scanner);

        int[][] matrix2 = createMatrix(scanner);
        addElementInMatrix(matrix2, scanner);

        if (compareDimentions(matrix1, matrix2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static int[][] createMatrix(Scanner scanner) {
        int[] parametersMatrix = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = parametersMatrix[0];
        int columns = parametersMatrix[1];
        int[][] matrix = new int[row][columns];
        return matrix;
    }

    public static int[][] addElementInMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int column = 0; column < matrix[1].length; column++) {
                matrix[row][column] = Integer.parseInt(input[column]);
            }
        }
        return matrix;
    }

    public static boolean compareDimentions(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) return false;
        for (int row = 0; row < matrix1.length; row++) {
            if (matrix1[row].length != matrix2[row].length) {
                return false;
            }

            for (int col = 0; col < matrix2[row].length; col++) {
                if (matrix1[row][col] != matrix2[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }
}