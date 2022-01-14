package ADV03MultidimensionalArrays.RE;

import java.util.Arrays;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEquals = false;
        int arrInput1 [] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = arrInput1[0];
        int cols = arrInput1[1];

        int[][] firstMatrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            firstMatrix[row] = rowData;
        }
        int arrInput2 [] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowss = arrInput2[0];
        int colss = arrInput2[1];
        int[][] secondMatrix = new int[rowss][colss];
        for (int row = 0; row < rowss; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            secondMatrix[row] = rowData;
        }
        if (firstMatrix.length != secondMatrix.length || cols !=colss) {
            System.out.println("not equal");
            return;

        } else {
            for (int row = 0; row < rowss ; row++) {
                for (int col = 0; col < colss; col++) {
                    if(firstMatrix[row][col]!=secondMatrix[row][col]){
                        isEquals = false;
                        break;
                    }else {
                         isEquals = true;
                    }
                }
            }
        }
        if(isEquals){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
