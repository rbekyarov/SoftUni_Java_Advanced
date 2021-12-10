package ADV03MultidimensionalArrays;


import java.util.Scanner;

public class p3Intersection_of_Two_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        char[][] matrixA = new char[row][column];
        char[][] matrixB = new char[row][column];

        insertData(matrixA, scanner);
        insertData(matrixB, scanner);
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                int currentElementMatrixA = matrixA[i][j];
                int currentElementMatrixB = matrixB[i][j];
                if (currentElementMatrixA == currentElementMatrixB) {
                    System.out.print(matrixA[i][j]+" ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static char[][] insertData(char[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            String input = scanner.nextLine().replaceAll(" ", "");
            char[] arr = input.toCharArray();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = arr[j];
            }
        }
        return matrix;
    }
}
