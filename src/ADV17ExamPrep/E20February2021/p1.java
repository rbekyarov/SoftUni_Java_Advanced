package ADV17ExamPrep.E20February2021;

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] magicBox1 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] magicBox2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        List<Integer> listElements = new ArrayList<>();
        ArrayDeque<Integer> magicBox1Queue = new ArrayDeque<>();
        for (int e : magicBox1) {
            magicBox1Queue.offer(e);
        }
        ArrayDeque<Integer> magicBox2Stack = new ArrayDeque<>();
        for (int e : magicBox2) {
            magicBox2Stack.push(e);
        }
        int sumBox = 0;
        while (!magicBox2Stack.isEmpty() && !magicBox1Queue.isEmpty()) {
            sumBox = magicBox1Queue.peek() + magicBox2Stack.peek();
            if (sumBox % 2 == 0) {
                listElements.add(sumBox);
                magicBox1Queue.poll();
                magicBox2Stack.pop();
            } else {
                int element = magicBox2Stack.pop();
                magicBox1Queue.offer(element);
            }
        }
        if (magicBox1Queue.isEmpty()) {
            System.out.println("First magic box is empty.");
        } else if (magicBox2Stack.isEmpty()) {
            System.out.println("Second magic box is empty.");
        }
        int sum = sumListelement(listElements);
        if (sum>=90){
            System.out.printf("Wow, your prey was epic! Value: %d%n",sum);
        }else {
            System.out.printf("Poor prey... Value: %d%n",sum);
        }
    }

    private static int sumListelement(List<Integer> listElements) {
        int sum = 0;
        for (Integer element : listElements) {
            sum += element;
        }
        return sum;
    }
}
