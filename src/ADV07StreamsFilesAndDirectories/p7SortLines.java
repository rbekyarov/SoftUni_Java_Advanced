package ADV07StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p7SortLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String pathIn = "D:\\folder\\input.txt";
        String outPath = "D:\\folder\\06.SortLinesOutput.txt";

        Path input = Paths.get(pathIn);
        Path output = Paths.get(outPath);

        List<String> lines = Files.readAllLines(input);
        Collections.sort(lines);
        Files.write(output, lines);
    }
}
