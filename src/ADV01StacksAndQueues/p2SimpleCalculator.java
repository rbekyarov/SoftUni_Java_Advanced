package ADV01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p2SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (i >= 2) {
                String operator = arr[i + 1];
                int num2 = Integer.parseInt(arr[i + 2]);
                if (operator.equals("+")) {
                    int result = stack.peek() + num2;
                    stack.push(result);
                } else {
                    int result = stack.peek() - num2;
                    stack.push(result);
                }

            } else {
                int num1 = Integer.parseInt(arr[i]);
                String operator = arr[i + 1];
                int num2 = Integer.parseInt(arr[i + 2]);
                if (operator.equals("+")) {
                    int result = num1 + num2;
                    stack.push(result);
                } else {
                    int result = num1 - num2;
                    stack.push(result);
                }
            }

        }
        System.out.println(stack.peek());
    }
}
