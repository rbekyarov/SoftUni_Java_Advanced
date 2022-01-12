package ADV02StacksAndQueuesExercise.RE;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = input[0];
        int S = input[1];
        int X = input[2];

        for (int i = 0; i < N; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 0; i < S; i++) {
            queue.poll();
        }
        if (queue.isEmpty()) {
            System.out.println("0");
        } else {
            if (queue.contains(X)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
