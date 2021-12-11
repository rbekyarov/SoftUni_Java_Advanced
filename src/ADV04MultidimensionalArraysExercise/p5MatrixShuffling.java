package ADV04MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class p5MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = input[0];
        int col = input[1];
        String[][] matrix = new String[row][col];

        for (int i = 0; i < matrix.length; i++) {
            String[] data = scanner.nextLine().split(" ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = data[j];
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] currentCommand = command.split(" ");
            if (currentCommand[0].equals("swap")) {
                int[] elementIndexes = new int[4];
                elementIndexes[0] = Integer.parseInt(currentCommand[1]);
                elementIndexes[1] = Integer.parseInt(currentCommand[2]);
                elementIndexes[2] = Integer.parseInt(currentCommand[3]);
                elementIndexes[3] = Integer.parseInt(currentCommand[4]);
                if ((elementIndexes[0] > row || elementIndexes[1] > col) || (elementIndexes[2] > row || elementIndexes[3] > col)) {
                    System.out.println("Invalid input!");
                    command = scanner.nextLine();
                    continue;
                } else {
                    String a = matrix[elementIndexes[0]][elementIndexes[1]];
                    String b = matrix[elementIndexes[2]][elementIndexes[3]];
                    matrix[elementIndexes[2]][elementIndexes[3]] = a;
                    matrix[elementIndexes[0]][elementIndexes[1]] = b;
                }
            } else {
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            }

            command = scanner.nextLine();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
