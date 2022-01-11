package ADV01StacksAndQueues.RE;


import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split(" ");

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);

        int n = Integer.parseInt(scanner.nextLine());
        int cycleCount = 0;
        while (queue.size() > 1) {
            cycleCount++;

            for (int i = 1; i < n; i++) {
                String currentChild = queue.poll();
                queue.offer(currentChild);
            }
            if (isPrimeCycle(cycleCount)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
        }
        System.out.println("Last is " + queue.peek());
    }

    private static boolean isPrimeCycle(int cycleCount) {

        if (cycleCount == 1) {
            return false;
        } else if (cycleCount == 2) {
            return true;
        }
        for (int i = 2; i <= cycleCount / 2; i++) {
            if (cycleCount % i == 0) {
                return false;
            }
        }
        return true;
    }
}
