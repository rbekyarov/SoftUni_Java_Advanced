package ADV04MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class p3DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < size; j++) {
                matrix[i][j] = arr[j];
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        int sum1 = 0;
        for (int i = 0; i <size ; i++) {
            for (int j = size-1; j >=0 ; j--) {
                sum1 += matrix[i][j];
                i++;
            }
        }
        System.out.println(Math.abs(sum-sum1));
    }
}
