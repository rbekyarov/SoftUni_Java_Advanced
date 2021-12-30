package ADV02StacksAndQueuesExercise.RE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String[] arr = scanner.nextLine().split(" ");

        for (String e : arr) {
            stack.push(e);
        }
        for (String e : stack) {
            System.out.print(stack.pop() + " ");
        }
    }
}
