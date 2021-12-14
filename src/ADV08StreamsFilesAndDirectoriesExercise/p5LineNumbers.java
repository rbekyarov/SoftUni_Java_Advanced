package ADV08StreamsFilesAndDirectoriesExercise;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class p5LineNumbers {
    public static void main(String[] args) throws IOException {
        String path = "E:\\folder\\Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";

        PrintWriter writer = new PrintWriter("E:\\folder\\Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");

        List<String> inputList = Files.readAllLines(Path.of(path));

        for (int i = 0; i <inputList.size() ; i++) {
            writer.println((i+1)+". "+inputList.get(i));
        }
        writer.close();
    }
}
