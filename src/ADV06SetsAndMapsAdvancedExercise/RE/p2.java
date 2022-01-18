package ADV06SetsAndMapsAdvancedExercise.RE;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firsSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        String [] sizeSets = scanner.nextLine().split(" ");
        int sizeFirst = Integer.parseInt(sizeSets[0]);
        int sizeSecond = Integer.parseInt(sizeSets[1]);

        while (sizeFirst-->0){
            firsSet.add(Integer.parseInt(scanner.nextLine()));
        }
        while (sizeSecond-->0){
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }
        Set<Integer> newSet = new LinkedHashSet<>();

        for (Integer element : firsSet) {
            if(secondSet.contains(element)){
                newSet.add(element);
            }
        }
        for (Integer element : newSet) {
            System.out.print(element+" ");
        }

    }
}
