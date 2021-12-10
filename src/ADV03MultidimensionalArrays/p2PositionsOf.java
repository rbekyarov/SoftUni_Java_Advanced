package ADV03MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class p2PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = input[0];
        int column = input[1];
        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < column; j++) {
                matrix[i][j] = currentRow[j];
            }
        }
        int findNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int currentElementMatrix = matrix[i][j];
                if (findNumber == currentElementMatrix) {
                    System.out.println(i + " " + j);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }
}