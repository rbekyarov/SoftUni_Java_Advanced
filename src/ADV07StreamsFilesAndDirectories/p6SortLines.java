package ADV07StreamsFilesAndDirectories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class p6SortLines {
    public static void main(String[] args) throws IOException {
        String path = "E:\\folder\\inputsort.txt";

        PrintWriter writer = new PrintWriter("E:\\folder\\output.txt");
        List<String> inputList = Files.readAllLines(Path.of(path));

        Set<String> outputSet = new TreeSet<>(inputList);
        for (String e : outputSet) {
            writer.println(e);
        }
        writer.close();
    }
}
