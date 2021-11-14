package ADV01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p4MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            String currentChar = "" + input.charAt(i);
            if (currentChar.equals("(")) {
                stack.push(i);
            } else if (currentChar.equals(")")) {
                int startIndex = stack.pop();
                String result = input.substring(startIndex, i + 1);
                System.out.println(result);
            }
        }
    }
}