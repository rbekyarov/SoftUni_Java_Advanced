package ADV01StacksAndQueues.RE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == '(') {
                stack.push(i);
            } else if (current == ')') {
                int startIndex = stack.pop();
                String result = input.substring(startIndex,i+1);
                System.out.println(result);
            }
        }

    }
}
