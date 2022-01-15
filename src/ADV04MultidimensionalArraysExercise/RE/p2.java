package ADV04MultidimensionalArraysExercise.RE;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        String [][] matrix = new String[rows][col];
        char startletter = 'a';
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String palindrome = "" + startletter + (char) (startletter + col) + startletter;
                matrix[row][col] = palindrome;
            }
            startletter = (char) (startletter + 1);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

    }
}
