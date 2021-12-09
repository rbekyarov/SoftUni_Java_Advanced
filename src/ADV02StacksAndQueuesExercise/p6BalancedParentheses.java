package ADV02StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p6BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] symbols = input.toCharArray();
        ArrayDeque<Character> openParenthesisStack = new ArrayDeque<>();
        ArrayDeque<Character> closedParenthesisQueue = new ArrayDeque<>();
        int counterOpenParenthesis = 0;
        for (int i = 0; i < symbols.length; i++) {
            char currentChar = symbols[i];
            if (currentChar == '[' || currentChar == '{' || currentChar == '(') {
                openParenthesisStack.push(currentChar);
                counterOpenParenthesis++;
            }
        }
        for (int i = counterOpenParenthesis; i < symbols.length; i++) {
            char currentChar = symbols[i];
            if (currentChar == ']' || currentChar == '}' || currentChar == ')') {
                closedParenthesisQueue.offer(currentChar);
            }
        }
        boolean isBalanced = true;
        if (!(openParenthesisStack.size() == closedParenthesisQueue.size())) {
            isBalanced = false;
        } else {
            for (int i = 0; i < counterOpenParenthesis; i++) {
                char openedParenthesis = openParenthesisStack.pop();
                char closedParenthesis = closedParenthesisQueue.poll();
                if (!isBalanced) {
                    break;
                }
                switch (openedParenthesis) {
                    case '{':
                        if (closedParenthesis == '}') {
                            isBalanced = true;
                        } else {
                            isBalanced = false;
                        }
                        break;
                    case '[':
                        if (closedParenthesis == ']') {
                            isBalanced = true;
                        } else {
                            isBalanced = false;
                        }
                        break;
                    case '(':
                        if (closedParenthesis == ')') {
                            isBalanced = true;
                        } else {
                            isBalanced = false;
                        }
                        break;
                    default:
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
