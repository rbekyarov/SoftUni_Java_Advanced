package ADV03MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class p6PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeRowCol = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[sizeRowCol][sizeRowCol];

        for (int i = 0; i <matrix.length ; i++) {
            int [] currentRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j <matrix[1].length ; j++) {
                matrix[i][j]=currentRow[j];
            }
        }
        for (int i = 0; i <sizeRowCol ; i++) {
            System.out.print(matrix[i][i]+" ");
        }
        System.out.println();
        for (int i = 0; i <sizeRowCol ; i++) {
            System.out.print(matrix[sizeRowCol-1-i][i]+" ");
        }
    }
}
