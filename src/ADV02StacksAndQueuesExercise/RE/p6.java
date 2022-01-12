package ADV02StacksAndQueuesExercise.RE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        boolean isBalanced = true;
        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);
            if (currentBracket == '{' || currentBracket == '[' || currentBracket == '(') {
                stack.push(currentBracket + "");
            } else if (currentBracket == ')' || currentBracket == ']' || currentBracket == '}') {
                queue.offer(currentBracket + "");
            }
        }
        if (stack.size() != queue.size() || stack.isEmpty()) {
            isBalanced = false;

        } else {
            while (!stack.isEmpty()) {
                String openBracket = stack.pop();
                String closedBracket = queue.poll();
                if (openBracket.equals("{") && closedBracket.equals("}")) {
                    isBalanced = true;
                } else if (openBracket.equals("(") && closedBracket.equals(")")) {
                    isBalanced = true;
                } else if (openBracket.equals("[") && closedBracket.equals("]")) {
                    isBalanced = true;
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
