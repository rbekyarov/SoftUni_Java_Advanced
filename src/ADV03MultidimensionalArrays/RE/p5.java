package ADV03MultidimensionalArrays.RE;

import java.util.Arrays;
import java.util.Scanner;

public class p5 {
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
        int [][]subMatrix = new int [2][2];
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <rows-1 ; i++) {
            for (int j = 0; j <cols-1 ; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] +
                        matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (sum>maxSum){
                    maxSum=sum;
                    subMatrix[0][0] = matrix[i][j];
                    subMatrix[0][1] = matrix[i][j + 1];
                    subMatrix[1][0] = matrix[i + 1][j];
                    subMatrix[1][1] = matrix[i + 1][j + 1];
                }
            }
        }
        for (int i = 0; i <subMatrix.length ; i++) {
            for (int j = 0; j <subMatrix[1].length ; j++) {
                System.out.print(subMatrix[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println(maxSum);
    }
}
