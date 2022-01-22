package ADV08StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class p1SumLines {
    public static void main(String[] args) {
        String path = "D:\\folder\\input.txt";

        List<String> inputList = null;
        try {
            inputList = Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : inputList) {
            int sumCharLine = 0;
            for (int i = 0; i <line.length() ; i++) {
                char currentChar = line.charAt(i);
                sumCharLine+=currentChar;
            }
            System.out.println(sumCharLine);

        }
    }
}
