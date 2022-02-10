package ADV17ExamPrep.E14April2021;

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tulips = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] daffodils = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> tulipsStack = new ArrayDeque<>();
        for (int e : tulips) {
            tulipsStack.push(e);
        }
        ArrayDeque<Integer> daffodilsQueue = new ArrayDeque<>();
        for (int e : daffodils) {
            daffodilsQueue.offer(e);
        }
        List<Integer> flowersLeft = new ArrayList<>();
        int countBouquets = 0;
        while (!tulipsStack.isEmpty() && !daffodilsQueue.isEmpty()) {
            int sumFlowers = tulipsStack.peek() + daffodilsQueue.peek();
            if (sumFlowers == 15) {
                countBouquets++;
                tulipsStack.pop();
                daffodilsQueue.poll();
            } else if (sumFlowers > 15) {
                int newValue = tulipsStack.pop() - 2;
                tulipsStack.push(newValue);
            } else {
                flowersLeft.add(tulipsStack.pop());
                flowersLeft.add(daffodilsQueue.poll());
            }
        }
        int sumListElement = 0;
        System.out.println();
        while (flowersLeft.size() > 0) {
            sumListElement += flowersLeft.get(0);
            flowersLeft.remove(0);
            if (sumListElement >= 15) {
                countBouquets++;
                sumListElement = sumListElement - 15;
            }
        }
        if (countBouquets >= 5) {
            System.out.printf("You made it! You go to the competition with %d bouquets!", countBouquets);
        } else {
            System.out.printf("You failed... You need more %d bouquets.", 5 - countBouquets);
        }
        System.out.println();
    }
}
