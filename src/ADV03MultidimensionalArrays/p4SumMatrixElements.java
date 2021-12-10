package ADV03MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class p4SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputRowColumns = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int row= inputRowColumns[0];
        System.out.println(row);
        int column= inputRowColumns[1];
        System.out.println(column);
        int [][] matrix = new int[row][column];
        for (int i = 0; i <matrix.length ; i++) {
            int [] inputData = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j <matrix[0].length ; j++) {
                matrix[i][j]=inputData[j];
            }
        }
        int sumElementMatrix = 0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                sumElementMatrix +=matrix[i][j];
            }
        }
        System.out.println(sumElementMatrix);
    }
}
