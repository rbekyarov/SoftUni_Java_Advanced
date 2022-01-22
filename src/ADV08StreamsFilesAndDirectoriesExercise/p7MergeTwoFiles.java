package ADV08StreamsFilesAndDirectoriesExercise;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class p7MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String file1 = "D:\\folder\\inputOne.txt";
        String file2 = "D:\\folder\\inputTwo.txt";

        PrintWriter writer = new PrintWriter("D:\\folder\\output.txt");
        String dataFromFile1 = Files.readString(Path.of(file1));
        String dataFromFile2 = Files.readString(Path.of(file2));
        writer.println(dataFromFile1);
        writer.println(dataFromFile2);
        writer.close();
    }
}
