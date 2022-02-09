package ADV17ExamPrep.E26June2021;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[rows][rows];
        String[] commands = scanner.nextLine().split(", ");
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            field[row] = line.toCharArray();
        }
        int pythonLength = 1;
        int pythonRow = 0;
        int pythonCol = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 's') {
                    pythonRow = row;
                    pythonCol = col;
                }
            }
        }
        boolean isEaten = false;
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            switch (command) {
                case "up":
                    if (pythonRow - 1 >= 0) {
                        field[pythonRow][pythonCol] = '*';
                        pythonRow--;

                    } else {
                        field[pythonRow][pythonCol] = '*';
                        pythonRow = field.length - 1;
                        field[pythonRow][pythonCol] = 's';
                    }
                    break;
                case "down":
                    if (pythonRow + 1 < field.length) {
                        field[pythonRow][pythonCol] = '*';
                        pythonRow++;

                    } else {
                        field[pythonRow][pythonCol] = '*';
                        pythonRow = 0;
                        field[pythonRow][pythonCol] = 's';
                    }
                    break;
                case "left":
                    if (pythonCol - 1 >= 0) {
                        field[pythonRow][pythonCol] = '*';
                        pythonCol--;

                    } else {
                        field[pythonRow][pythonCol] = '*';
                        pythonCol = field.length - 1;
                        ;
                        field[pythonRow][pythonCol] = 's';
                    }
                    break;
                case "right":
                    if (pythonCol + 1 < field.length) {
                        field[pythonRow][pythonCol] = '*';
                        pythonCol++;

                    } else {
                        field[pythonRow][pythonCol] = '*';
                        pythonCol = 0;
                        field[pythonRow][pythonCol] = 's';
                    }
                    break;
            }
            if (field[pythonRow][pythonCol] == 'f') {
                pythonLength++;
                field[pythonRow][pythonCol] = '*';
                if (!chekMoreFood(field)) {

                    isEaten = true;
                    break;
                }
                field[pythonRow][pythonCol] = 's';
            } else if (field[pythonRow][pythonCol] == 'e') {
                System.out.println("You lose! Killed by an enemy!");
                break;
            } else {
                field[pythonRow][pythonCol] = 's';
            }
        }
        if (isEaten) {
            System.out.println("You win! Final python length is " + pythonLength);
        } else {
            System.out.printf("You lose! There is still %d food to be eaten.%n", 3 - pythonLength);
        }
    }

    private static boolean chekMoreFood(char[][] field) {
        boolean isFind = false;
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'f') {
                    isFind = true;
                    break;
                }
            }
            if (isFind) {
                break;
            }
        }
        if (isFind) {
            return true;
        } else {
            return false;
        }
    }
}
