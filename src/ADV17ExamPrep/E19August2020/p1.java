package ADV17ExamPrep.E19August2020;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lilies = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] roses = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> liliesStack = new ArrayDeque<>();
        for (int e : lilies) {
            liliesStack.push(e);
        }
        ArrayDeque<Integer> rosesQueue = new ArrayDeque<>();
        for (int e : roses) {
            rosesQueue.offer(e);
        }
        int flowerWreaths = 0;
        boolean isWreathsDone = false;
        int flowersLeft = 0;
        while (!liliesStack.isEmpty() && !rosesQueue.isEmpty()) {

            if (flowerWreaths >= 5) {
                isWreathsDone = true;
            }
            int sumElement = liliesStack.peek() + rosesQueue.peek();

            if (sumElement == 15) {
                flowerWreaths++;
                rosesQueue.poll();
                liliesStack.pop();
            } else if (sumElement > 15) {
                int addElement = liliesStack.poll() - 2;
                liliesStack.offer(addElement);
            } else {
                flowersLeft += liliesStack.pop() + rosesQueue.poll();

            }

        }
        if (flowersLeft / 15 >= 1) {
            flowerWreaths += flowersLeft / 15;

            if (flowerWreaths == 5) {
                isWreathsDone = true;

            }
        }
        if (isWreathsDone) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!",flowerWreaths);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - flowerWreaths);
        }
    }
}
