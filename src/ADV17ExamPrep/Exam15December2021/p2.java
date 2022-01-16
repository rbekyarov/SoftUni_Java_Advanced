package ADV17ExamPrep.Exam15December2021;

import java.util.Arrays;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int size = Integer.parseInt(scanner.nextLine());

        String [][] fieldSparta = new String[size][size];

        for (int row = 0; row <size ; row++) {
            String[]data = scanner.nextLine().split("");
            fieldSparta[row]=data;
        }
        int[]targetIndexes = new int[2];
        int[]startIndexes = new int[2];
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {

                if(fieldSparta[i][j].equals("H")){
                    targetIndexes[0]=i;
                    targetIndexes[1]=j;

                }
                else if(fieldSparta[i][j].equals("P")){
                     startIndexes[0] = i;
                     startIndexes[1] = j;
                }
            }
        }
        while (energy!=0){

        }

    }
}
