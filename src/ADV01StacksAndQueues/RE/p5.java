package ADV01StacksAndQueues.RE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> printQueue = new ArrayDeque<>();
        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (printQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printQueue.poll());
                }
            } else {
                printQueue.offer(input);
            }
            input = scanner.nextLine();
        }
        for (String element : printQueue) {
            System.out.println(element);
        }
    }
}
