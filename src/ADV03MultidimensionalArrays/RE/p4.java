package ADV03MultidimensionalArrays.RE;

import java.util.Arrays;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i <rows ; i++) {
            int [] dataMatrix = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=dataMatrix;
        }
        int sum = 0;

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                sum+=matrix[i][j];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);



    }
}
