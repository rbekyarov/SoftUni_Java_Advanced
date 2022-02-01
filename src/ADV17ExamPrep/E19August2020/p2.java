package ADV17ExamPrep.E19August2020;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[rows][rows];

        for (int row = 0; row < rows; row++) {
            field[row] = scanner.nextLine().toCharArray();
        }
        int beeRow = 0;
        int beeCol = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'B') {
                    beeRow = row;
                    beeCol = col;
                }
            }
        }
        int pollinatedFlowers = 0;
        boolean isGoneBee = false;
        String input = scanner.nextLine();
        while (!input.equals("End")) {

            switch (input) {
                case "up":
                    if (beeRow - 1 >= 0) {
                        field[beeRow][beeCol] = '.';
                        beeRow--;

                    } else {
                        isGoneBee = true;
                        field[beeRow][beeCol] = '.';
                    }
                    break;
                case "down":
                    if (beeRow + 1 < field.length) {
                        field[beeRow][beeCol] = '.';
                        beeRow++;

                    } else {
                        isGoneBee = true;
                        field[beeRow][beeCol] = '.';
                    }
                    break;
                case "left":
                    if (beeCol - 1 >= 0) {
                        field[beeRow][beeCol] = '.';
                        beeCol--;

                    } else {
                        isGoneBee = true;
                        field[beeRow][beeCol] = '.';
                    }
                    break;
                case "right":
                    if (beeCol + 1 < field.length) {
                        field[beeRow][beeCol] = '.';
                        beeCol++;

                    } else {
                        isGoneBee = true;
                        field[beeRow][beeCol] = '.';
                    }
                    break;
            }
            if (isGoneBee) {
                break;
            }
            if (field[beeRow][beeCol] == 'f') {
                pollinatedFlowers++;
                field[beeRow][beeCol] = 'B';

            } else if (field[beeRow][beeCol] == '.') {
                field[beeRow][beeCol] = 'B';

            } else if (field[beeRow][beeCol] == 'O') {
                switch (input) {
                    case "up":
                        if (beeRow - 1 >= 0) {
                            field[beeRow][beeCol] = '.';
                            beeRow--;

                        } else {
                            isGoneBee = true;
                            field[beeRow][beeCol] = '.';
                        }
                        break;
                    case "down":
                        if (beeRow + 1 < field.length) {
                            field[beeRow][beeCol] = '.';
                            beeRow++;

                        } else {
                            isGoneBee = true;
                            field[beeRow][beeCol] = '.';
                        }
                        break;
                    case "left":
                        if (beeCol - 1 >= 0) {
                            field[beeRow][beeCol] = '.';
                            beeCol--;

                        } else {
                            isGoneBee = true;
                            field[beeRow][beeCol] = '.';
                        }
                        break;
                    case "right":
                        if (beeCol + 1 < field.length) {
                            field[beeRow][beeCol] = '.';
                            beeCol++;

                        } else {
                            isGoneBee = true;
                            field[beeRow][beeCol] = '.';
                        }
                        break;
                }

                if (field[beeRow][beeCol] == 'f') {
                    pollinatedFlowers++;
                    field[beeRow][beeCol] = 'B';

                } else if (field[beeRow][beeCol] == '.') {
                    field[beeRow][beeCol] = 'B';

                }
            }
            input = scanner.nextLine();
        }
        if (isGoneBee) {
            System.out.println("The bee got lost!");
        }
        if (pollinatedFlowers >= 5) {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", pollinatedFlowers);
        } else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - pollinatedFlowers);
        }
        printField(field);
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
