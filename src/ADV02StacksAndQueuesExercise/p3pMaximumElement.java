package ADV02StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class p3pMaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stackNumbers = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String typeComand = command.split(" ")[0];
            switch (typeComand) {
                case "1":
                    int addElement = Integer.parseInt(command.split(" ")[1]);
                    stackNumbers.push(addElement);
                    break;
                case "2":
                    stackNumbers.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stackNumbers));
                    break;
            }
        }
    }
}
