package ADV02StacksAndQueuesExercise.RE;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int N = arr[0];
        int S = arr[1];
        int X = arr[2];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(scanner.next());
            stack.push(num);
        }
        for (int i = 0; i < S; i++) {
            stack.pop();
        }
        for (Integer integer : stack) {
            if (stack.contains(X)) {
                System.out.println(true);
                break;
            } else {
                if (integer < min) {
                    min = integer;
                }
            }
        }

    }
}
