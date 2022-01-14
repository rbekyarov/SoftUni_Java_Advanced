package ADV03MultidimensionalArrays.RE;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrix1 = new char[rows][cols];
        char[][] matrix2 = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] data = scanner.nextLine().split(" ");
            char[] dataChar = new char[data.length];
            for (int j = 0; j < data.length ; j++) {
                dataChar[j]=data[j].charAt(0);
            }
            matrix1[i] = dataChar;
        }

        for (int i = 0; i < rows; i++) {
            String[] data = scanner.nextLine().split(" ");
            char[] dataChar = new char[data.length];
            for (int j = 0; j < data.length ; j++) {
                dataChar[j]=data[j].charAt(0);
            }
            matrix2[i] = dataChar;
        }
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                if (matrix1[i][j]==matrix2[i][j]){
                    System.out.print(matrix1[i][j]+" ");
                }else {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}
