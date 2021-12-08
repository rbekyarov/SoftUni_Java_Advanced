package ADV01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p6Hot_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> queuePlayer = new ArrayDeque<>();
        for (String player : input) {
            queuePlayer.offer(player);
        }
        int n = Integer.parseInt(scanner.nextLine());
        while (queuePlayer.size() != 1) {
            for (int i = 0; i < n-1; i++) {
                String currentPlayer = queuePlayer.poll();
                queuePlayer.offer(currentPlayer);

            }
            String removedPlayer = queuePlayer.poll();
            System.out.println("Removed "+removedPlayer);

        }
        for (String winner : queuePlayer){
            System.out.println("Last is "+winner);
        }
    }
}
