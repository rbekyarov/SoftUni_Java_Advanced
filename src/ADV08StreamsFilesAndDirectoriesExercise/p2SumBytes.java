package ADV08StreamsFilesAndDirectoriesExercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class p2SumBytes {
    public static void main(String[] args) throws IOException {
        String path = "D:\\folder\\input.txt";
        FileInputStream fileStream = new FileInputStream(path);
        Scanner scanner = new Scanner(fileStream);
        int sumAllSymbols = 0;
        while (scanner.hasNext()){
            String text = scanner.nextLine();
            for (char symbol : text.toCharArray()){
                sumAllSymbols+=symbol;
            }
        }
        System.out.println(sumAllSymbols);
    }
}
