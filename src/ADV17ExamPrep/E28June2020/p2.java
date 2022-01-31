package ADV17ExamPrep.E28June2020;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[rows][rows];

        for (int row = 0; row < rows; row++) {
            field[row] = scanner.nextLine().toCharArray();
        }
        int snakeRow = 0;
        int snikeCol = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'S') {
                    snakeRow = row;
                    snikeCol = col;
                }
            }
        }
        int foodQuantity = 0;
        boolean isFedSnake = false;
        boolean isGoneSnake = false;
        while (true) {
            if (isFedSnake || isGoneSnake) {
                break;
            }
            if (foodQuantity == 10) {
                isFedSnake = true;
                continue;
            }
            String command = scanner.nextLine();
            switch (command) {
                case "up":
                    if (snakeRow - 1 >= 0) {
                        field[snakeRow][snikeCol] = '.';
                        snakeRow--;

                    } else {
                        isGoneSnake = true;
                    }
                    break;
                case "down":
                    if (snakeRow + 1 < field.length) {
                        field[snakeRow][snikeCol] = '.';
                        snakeRow++;

                    } else {
                        isGoneSnake = true;
                    }
                    break;
                case "left":
                    if (snikeCol - 1 >= 0) {
                        field[snakeRow][snikeCol] = '.';
                        snikeCol--;

                    } else {
                        isGoneSnake = true;
                    }
                    break;
                case "right":
                    if (snikeCol + 1 < field.length) {
                        field[snakeRow][snikeCol] = '.';
                        snikeCol++;

                    } else {
                        isGoneSnake = true;
                    }
                    break;
            }
            if (field[snakeRow][snikeCol] == 'B') {
                field[snakeRow][snikeCol] = '.';
                snakeRow = searchNextB(field)[0];
                snikeCol = searchNextB(field)[1];
                field[snakeRow][snikeCol] = 'S';
            }
            if (field[snakeRow][snikeCol] == '*') {
                foodQuantity++;
                field[snakeRow][snikeCol] = 'S';

            }
        }
        if (isGoneSnake) {
            field[snakeRow][snikeCol] = '.';
            System.out.println("Game over!");
        }
        if (isFedSnake) {
            System.out.println("You won! You fed the snake.");
        }
        System.out.println("Food eaten: " + foodQuantity);
        printField(field);
    }

    private static int[] searchNextB(char[][] field) {
        int[] arr = new int[2];
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'B') {
                    arr[0] = row;
                    arr[1] = col;
                }
            }
        }
        return arr;
    }

    private static void printField(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print(field[row][col]);
            }
            System.out.println();
        }
    }
}
