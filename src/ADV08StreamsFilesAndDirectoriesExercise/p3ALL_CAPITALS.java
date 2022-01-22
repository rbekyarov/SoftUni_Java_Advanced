package ADV08StreamsFilesAndDirectoriesExercise;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class p3ALL_CAPITALS {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "D:\\folder\\input.txt";
        FileInputStream fileStream = new FileInputStream(path);
        PrintWriter writer = new PrintWriter("D:\\folder\\output.txt");

        Scanner scanner = new Scanner(fileStream);

        while (scanner.hasNext()) {
            StringBuilder output = new StringBuilder();
            String text = scanner.nextLine();
            output.append(text.toUpperCase(Locale.ROOT));
            writer.println(output);
        }
        writer.close();
    }
}
