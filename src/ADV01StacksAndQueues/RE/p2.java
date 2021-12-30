package ADV01StacksAndQueues.RE;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                stack.push(Integer.parseInt(list.get(i)));
                String sign = list.get(i + 1);
                if (sign.equals("+")) {
                    stack.push(stack.pop() + Integer.parseInt(list.get(i + 2)));
                } else {
                    stack.push(stack.pop() - Integer.parseInt(list.get(i + 2)));
                }
                list.remove(i + 2);
                list.remove(i + 1);
            } else {
                String sign = list.get(i);
                if (sign.equals("+")) {
                    stack.push(stack.pop() + Integer.parseInt(list.get(i + 1)));
                } else {
                    stack.push(stack.pop() - Integer.parseInt(list.get(i + 1)));
                }
                list.remove(i + 1);
            }
        }
        System.out.println(stack.pop());
    }
}
