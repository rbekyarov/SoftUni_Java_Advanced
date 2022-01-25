package ADV09FunctionalProgramming.RE;

import java.util.Arrays;
import java.util.Scanner;


public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Count = " + nums.length);
        System.out.println("Sum = " + Arrays.stream(nums).sum());

    }
}
