package ADV02StacksAndQueuesExercise.RE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommand = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < countCommand; i++) {

            String[] arr = scanner.nextLine().split(" ");
            String command = arr[0];

            switch (command) {
                case "1":
                    stack.push(Integer.parseInt(arr[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    for (Integer integer : stack) {
                        if (integer > max) {
                            max = integer;
                        }
                    }
                    System.out.println(max);
                    break;
            }
        }
    }
}
