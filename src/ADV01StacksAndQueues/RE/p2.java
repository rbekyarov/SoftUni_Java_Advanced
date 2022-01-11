package ADV01StacksAndQueues.RE;

import java.util.*;
import java.util.stream.Collectors;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] input = scanner.nextLine().split(" ");
        Collections.addAll(stack, input);

        while (stack.size() > 1) {
            int firstNum = Integer.parseInt(stack.pop());
            String singh = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());
            int result = 0;
            if (singh.equals("+")) {
                result = firstNum + secondNum;
            } else {
                result = firstNum - secondNum;
            }
            stack.push(result+"");
        }
        System.out.println(stack.peek());
    }
}
