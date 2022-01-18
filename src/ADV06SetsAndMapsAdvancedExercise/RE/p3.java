package ADV06SetsAndMapsAdvancedExercise.RE;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLines = Integer.parseInt(scanner.nextLine());
        Set<String> compounds = new TreeSet<>();
        while (countLines-->0){
            String [] lineCompounds = scanner.nextLine().split(" ");
            for (int i = 0; i <lineCompounds.length ; i++) {
                compounds.add(lineCompounds[i]);
            }
        }
        for (String element : compounds) {
            System.out.print(element+" ");
        }

    }
}
