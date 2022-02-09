package ADV17ExamPrep.E26June2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tasks = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] threads = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> tasksStack = new ArrayDeque<>();
        for (int e : tasks) {
            tasksStack.push(e);
        }
        ArrayDeque<Integer> threadsQueue = new ArrayDeque<>();
        for (int e : threads) {
            threadsQueue.offer(e);
        }
        int taskToBeKilled = Integer.parseInt(scanner.nextLine());

        while (!tasksStack.isEmpty() && !threadsQueue.isEmpty()) {
            if (tasksStack.peek() != taskToBeKilled) {

                if (tasksStack.peek() < threadsQueue.peek()) {
                    tasksStack.pop();
                    threadsQueue.poll();
                } else {
                    threadsQueue.poll();
                }
            }else {
                System.out.printf("Thread with value %d killed task %d%n",threadsQueue.peek(),tasksStack.pop());
                break;
            }
        }
        System.out.println("" + threadsQueue.toString().replaceAll("[\\[\\],]", ""));
    }
}
