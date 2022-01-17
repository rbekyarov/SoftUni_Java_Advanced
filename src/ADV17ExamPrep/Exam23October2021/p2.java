/*
                                                Mouse and cheese
You will be given an integer n for the size of the mouse territory with a square shape. On the next n lines, you will receive the rows of the territory. The mouse will be placed in a random position, marked with the letter 'M'. On random positions, there will be cheese, marked with 'c'. There may also be a bonus on the territory. There will always be only one bonus. It will be marked with the letter - 'B'. All of the empty positions will be marked with '-'.
        Each turn, you will be given a command for the mouse’s movement.
        The commands will be: "up", "down", "left", "right", "end".
        If the mouse moves to cheese, it eats the cheese and increases the cheese it has eaten by one.
        If it goes to a bonus, the mouse gets a bonus one move forward and then the bonus disappears. If the mouse goes out she can't return and the program ends. If the mouse receives "end" command the program ends. The mouse needs at least 5 eaten cheeses.
        Input
        •	On the first line, you are given the integer n – the size of the square matrix.
        •	The next n lines hold the values for every row.
        •	On each of the next lines, until you receive "end" command,  you will receive a move command.
        Output
        •	On the first line:
        o	If the mouse goes out of its territory print: "Where is the mouse?".
        •	On the second line:
        o	 If the mouse couldn’t eat enough cheeses print: "The mouse couldn't eat the cheeses, she needed {needed} cheeses more.".
        o	If the mouse has successfully eaten enough cheeses print: "Great job, the mouse is fed {eaten cheeses} cheeses!".
        •	At the end print the matrix.
        Constraints
        •	The size of the square matrix will be between [2…10].
        •	There will always be only one bonus, marked with 'B.
        •	The mouse position will be marked with 'M'.
        •	There won't be a case where a bonus moves the mouse out of its territory.

        Examples
INPUT         OUTPUT
3               The mouse couldn't eat the cheeses, she needed 4 cheeses more.
M--             ---
ccc             cc-
---             -M-
right
right
down
down
left
end
*/


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
            if(isMouseIsGoing){
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
