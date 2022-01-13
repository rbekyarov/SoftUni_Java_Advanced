package ADV02StacksAndQueuesExercise.RE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int countOperation = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> lastOperation = new ArrayDeque<>();
        for (int i = 0; i < countOperation; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "1":
                    String stringForAppend = command[1];
                    sb.append(stringForAppend);
                    lastOperation.push(sb.toString());
                    break;
                case "2":
                    int indexForRemove = Integer.parseInt(command[1]);
                    sb.delete(sb.length() - indexForRemove, sb.length());
                    lastOperation.push(sb.toString());
                    break;
                case "3":
                    int indexForPrint = Integer.parseInt(command[1]);
                    System.out.println(sb.toString().toCharArray()[indexForPrint-1]+"");

                    break;
                case "4":
                    sb.delete(0,sb.length());
                    sb.append(lastOperation.pop());

                    break;
            }
        }

    }
}
