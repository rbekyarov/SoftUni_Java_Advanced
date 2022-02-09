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
        boolean isDisappear = false;
        int sumMoney = 0;
        String input = scanner.nextLine();
        while (true) {

            switch (input) {
                case "up":
                    if (positionRow - 1 >= 0) {
                        field[positionRow][positionCol] = '-';
                        positionRow--;

                    } else {
                        isDisappear = true;
                        field[positionRow][positionCol] = '-';
                    }
                    break;
                case "down":
                    if (positionRow + 1 < field.length) {
                        field[positionRow][positionCol] = '-';
                        positionRow++;

                    } else {
                        isDisappear = true;
                        field[positionRow][positionCol] = '-';
                    }
                    break;
                case "left":
                    if (positionCol - 1 >= 0) {
                        field[positionRow][positionCol] = '-';
                        positionCol--;

                    } else {
                        isDisappear = true;
                        field[positionRow][positionCol] = '-';
                    }
                    break;
                case "right":
                    if (positionCol + 1 < field.length) {
                        field[positionRow][positionCol] = '-';
                        positionCol++;

                    } else {
                        isDisappear = true;
                        field[positionRow][positionCol] = '-';
                    }
                    break;
            }
            if (isDisappear) {
                break;
            }
            char digit = field[positionRow][positionCol];
            if (Character.isDigit(digit)) {
                sumMoney += digit - '0';
                field[positionRow][positionCol] = 'S';
            }
            if (sumMoney > 49) {
                break;
            }
            if (field[positionRow][positionCol] == 'O') {
                field[positionRow][positionCol] = '-';
                positionRow = findNextO(field)[0];
                positionCol = findNextO(field)[1];
                field[positionRow][positionCol] = 'S';
            }
            if (field[positionRow][positionCol] == '-') {
                field[positionRow][positionCol] = 'S';
            }
            input = scanner.nextLine();
        }
        if (sumMoney > 49) {
            System.out.println("Good news! You succeeded in collecting enough money!");
        }
        if (isDisappear) {
            System.out.println("Bad news, you are out of the bakery.");
        }
        System.out.println("Money: " + sumMoney);
        printMatrix(field);
    }

    private static void printMatrix(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print(field[row][col]);
            }
            System.out.println();
        }
    }

    private static int[] findNextO(char[][] field) {
        int[] arr = new int[2];
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field.length; col++) {
                if (field[row][col] == 'O') {
                    arr[0] = row;
                    arr[1] = col;
                    break;
                }
            }
        }
        return arr;
    }
}