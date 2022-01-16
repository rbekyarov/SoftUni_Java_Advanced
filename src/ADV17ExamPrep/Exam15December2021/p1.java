package ADV17ExamPrep.Exam15December2021;

import java.util.ArrayDeque;

import java.util.Arrays;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> malesStack = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(malesStack::push);

        ArrayDeque<Integer> femalesQueue = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(femalesQueue::offer);

        int matches = 0;

        while (!malesStack.isEmpty() && !femalesQueue.isEmpty()) {
            int male = malesStack.peek();
            int female = femalesQueue.peek();

            if (male <= 0) {
                malesStack.pop();
                continue;
            }
            if (female <= 0) {
                femalesQueue.poll();
                continue;
            }

            if (male % 25 == 0) {
                malesStack.pop();
                malesStack.pop();
                continue;
            }

            if (female % 25 == 0) {
                femalesQueue.poll();
                femalesQueue.poll();
                continue;
            }

            if (male == female) {
                malesStack.pop();
                femalesQueue.poll();
                matches++;

            } else {
                femalesQueue.poll();
                int pop = malesStack.pop();
                malesStack.push(pop - 2);
            }
        }

        System.out.println(String.format("Matches: %d", matches));
        if (malesStack.size() > 0) {
            System.out.println("Males left: " + malesStack.toString().replaceAll("[\\[\\]]", ""));
        } else {
            System.out.println("Males left: none");
        }
        if (femalesQueue.size() > 0) {
            System.out.println(String.format("Females left: %s", femalesQueue.toString().replaceAll("[\\[\\]]", "")));
        } else {
            System.out.println("Females left: none");
        }
    }
}
