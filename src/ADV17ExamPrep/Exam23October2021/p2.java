package ADV17ExamPrep.Exam23October2021;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            char[] data = scanner.nextLine().toCharArray();
            matrix[i] = data;
        }
        int mouseRow = getPositionRow(matrix);
        int mouseCol = getPositionCol(matrix);
        int foundCheese = 0;
        boolean isMouseIsGoing = false;

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if(isMouseIsGoing){
                break;
            }
            switch (command) {
                case "right":
                    matrix[mouseRow][mouseCol] = '-';
                    if (mouseCol+1 <= size-1) {
                        mouseCol++;
                    } else {
                        isMouseIsGoing = true;
                        break;
                    }

                    if (isCheesesFound(matrix, mouseRow, mouseCol)) {
                        foundCheese++;
                    }
                    if (isBonusIsFound(matrix, mouseRow, mouseCol)) {
                        matrix[mouseRow][mouseCol] = '-';
                        if (mouseCol+1 <= size-1) {
                            mouseCol++;
                            if (isCheesesFound(matrix, mouseRow, mouseCol)) {
                                foundCheese++;}
                        } else {
                            isMouseIsGoing = true;
                            break;
                        }
                    }
                    matrix[mouseRow][mouseCol] = 'M';

                    break;


                case "down":
                    matrix[mouseRow][mouseCol] = '-';
                    if (mouseRow+1 <= size-1) {
                        mouseRow++;
                    } else {
                        isMouseIsGoing = true;
                        break;
                    }

                    if (isCheesesFound(matrix, mouseRow, mouseCol)) {
                        foundCheese++;
                    }
                    if (isBonusIsFound(matrix, mouseRow, mouseCol)) {
                        matrix[mouseRow][mouseCol] = '-';
                        if (mouseRow+1 <= size-1) {
                            mouseRow++;
                            if (isCheesesFound(matrix, mouseRow, mouseCol)) {
                                foundCheese++;}
                        } else {
                            isMouseIsGoing = true;
                            break;
                        }
                    }

                    matrix[mouseRow][mouseCol] = 'M';
                    break;


                case "left":
                    matrix[mouseRow][mouseCol] = '-';
                    if (mouseCol-1 >= 0) {
                        mouseCol--;
                        if (isCheesesFound(matrix, mouseRow, mouseCol)) {
                            foundCheese++;}
                    } else {
                        isMouseIsGoing = true;
                        break;
                    }

                    if (isCheesesFound(matrix, mouseRow, mouseCol)) {
                        foundCheese++;
                    }
                    if (isBonusIsFound(matrix, mouseRow, mouseCol)) {
                        matrix[mouseRow][mouseCol] = '-';
                        if (mouseCol-1 >= 0) {
                            mouseCol--;
                            if (isCheesesFound(matrix, mouseRow, mouseCol)) {
                                foundCheese++;}
                        } else {
                            isMouseIsGoing = true;
                            break;
                        }
                    }
                    matrix[mouseRow][mouseCol] = 'M';
                    break;


                case "up":
                    matrix[mouseRow][mouseCol] = '-';
                    if (mouseRow-1 >= 0) {
                        mouseRow--;
                    } else {
                        isMouseIsGoing = true;
                        break;
                    }

                    if (isCheesesFound(matrix, mouseRow, mouseCol)) {
                        foundCheese++;
                    }
                    if (isBonusIsFound(matrix, mouseRow, mouseCol)) {
                        matrix[mouseRow][mouseCol] = '-';
                        if (mouseRow-1 >= 0) {
                            mouseRow--;
                            if (isCheesesFound(matrix, mouseRow, mouseCol)) {
                                foundCheese++;}
                        } else {
                            isMouseIsGoing = true;
                            break;
                        }
                    }
                    matrix[mouseRow][mouseCol] = 'M';
                    break;
            }

            command = scanner.nextLine();
        }
        if(isMouseIsGoing){
            System.out.println("Where is the mouse?");
        }
        if (foundCheese >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!.\n", foundCheese);
        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.\n", 5 - foundCheese);
        }
        printMatrix(matrix);
    }

    private static boolean isBonusIsFound(char[][] matrix, int mouseRow, int mouseCol) {

        boolean isFound = false;
        if (matrix[mouseRow][mouseCol] == 'B') {
            isFound = true;
        }

        return isFound;
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }
    }

    private static boolean isCheesesFound(char[][] matrix, int mouseRow, int mouseCol) {
        boolean isFound = false;
        if (matrix[mouseRow][mouseCol] == 'c') {
            isFound = true;
        }

        return isFound;
    }

    private static int getPositionCol(char[][] matrix) {
        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 'M') {
                    col = j;
                }
            }
        }
        return col;
    }

    private static int getPositionRow(char[][] matrix) {
        int row = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 'M') {
                    row = i;
                }
            }
        }
        return row;
    }
}
