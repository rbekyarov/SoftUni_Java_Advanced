package ADV01StacksAndQueues.RE;


import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split(" ");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);
        int n = Integer.parseInt(scanner.nextLine());
        while (queue.size() > 1) {

            for (int i = 1; i < n; i++) {
                String currentChild = queue.poll();
                queue.offer(currentChild);
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.peek());
    }
}
