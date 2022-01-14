package ADV03MultidimensionalArrays.RE;

import java.util.Arrays;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] matrixData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = matrixData;
        }
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == number) {
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }
        if (count==0){
            System.out.println("not found");
        }
    }
}
