package ADV17ExamPrep.E16December2020;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[rows][rows];

        for (int row = 0; row < rows; row++) {
            field[row] = scanner.nextLine().toCharArray();
        }
        int positionRow = 0;
        int positionCol = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'S') {
                    positionRow = row;
                    positionCol = col;
                }
            }
        }
    }
}
