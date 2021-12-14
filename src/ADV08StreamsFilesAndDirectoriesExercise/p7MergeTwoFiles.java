package ADV08StreamsFilesAndDirectoriesExercise;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class p7MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String file1 = "E:\\folder\\Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String file2 = "E:\\folder\\Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        PrintWriter writer = new PrintWriter("E:\\folder\\Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        String dataFromFile1 = Files.readString(Path.of(file1));
        String dataFromFile2 = Files.readString(Path.of(file2));
        writer.println(dataFromFile1);
        writer.println(dataFromFile2);
        writer.close();
    }
}
