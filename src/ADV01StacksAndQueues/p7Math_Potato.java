package ADV01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p7Math_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> queuePlayer = new ArrayDeque<>();
        for (String player : input) {
            queuePlayer.offer(player);
        }
        int n = Integer.parseInt(scanner.nextLine());
        int cycles = 1;
        while (queuePlayer.size() != 1) {
            for (int i = 0; i < n - 1; i++) {
                String currentPlayer = queuePlayer.poll();
                queuePlayer.offer(currentPlayer);

            }
            if (cycles != 1 && isPrime(cycles)) {
                String player = queuePlayer.peek();
                System.out.println("Prime " + player);
            } else {
                String player = queuePlayer.poll();
                System.out.println("Removed " + player);
            }
            cycles++;

        }
        for (String winner : queuePlayer) {
            System.out.println("Last is " + winner);
        }
    }

    private static boolean isPrime(int cycles) {
        for (int i = 2; i < cycles; i++) {
            if (cycles % i == 0) {
                return false;
            }
        }
        return true;
    }
}