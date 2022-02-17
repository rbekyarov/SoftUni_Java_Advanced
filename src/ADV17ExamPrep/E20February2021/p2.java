package ADV17ExamPrep.E20February2021;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[rows][rows];

        String[] commands = scanner.nextLine().split(",");
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            field[row] = line.toCharArray();
        }
        int sapperRow = 0;
        int sapperCol = 0;
        boolean found = false;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 's') {
                    sapperRow = row;
                    sapperCol = col;
                    found = true;
                }
            }
            if (found) {
                break;
            }
        }
        int countBombs = checkBombCount(field);
        int findBombs = 0;
        boolean isFindExit = false;
        for (String command : commands) {
            field[sapperRow][sapperCol] = '+';
            switch (command) {
                case "up":
                    if (sapperRow - 1 >= 0) {
                        sapperRow--;
                    }
                    break;
                case "down":
                    if (sapperRow + 1 < field.length) {
                        sapperRow++;
                    }
                    break;
                case "left":
                    if (sapperCol - 1 >= 0) {
                        sapperCol--;
                    }
                    break;
                case "right":
                    if (sapperCol + 1 < field.length) {
                        sapperCol++;
                        break;
                    }
            }
            if (field[sapperRow][sapperCol] == 'B') {
                findBombs++;
                System.out.println("You found a bomb!");

                field[sapperRow][sapperCol] = 's';


            } else if (field[sapperRow][sapperCol] == 'e') {
                isFindExit = true;
                break;

            } else {
                field[sapperRow][sapperCol] = 's';
            }
            if (countBombs == findBombs) {
                System.out.println("Congratulations! You found all bombs!");
                return;
            }
        }
        if (isFindExit) {
            System.out.printf("END! %d bombs left on the field", countBombs - findBombs);
            return;
        }
        if (countBombs == findBombs) {
            System.out.println("Congratulations! You found all bombs!");
        } else {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", countBombs - findBombs, sapperRow, sapperCol);

        }
    }

    private static int checkBombCount(char[][] field) {
        int count = 0;
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'B') {
                    count++;
                }
            }
        }
        return count;
    }
}
