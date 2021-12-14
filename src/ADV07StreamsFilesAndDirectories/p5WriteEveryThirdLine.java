package ADV07StreamsFilesAndDirectories;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class p5WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "E:\\folder\\input.txt";

        PrintWriter writer = new PrintWriter("E:\\folder\\output.txt");
        List<String> inputList = Files.readAllLines(Path.of(path));

        for (int i = 2; i < inputList.size(); i += 3) {
            writer.println(inputList.get(i));
        }
        writer.close();
    }
}
