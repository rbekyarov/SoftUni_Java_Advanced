package ADV07StreamsFilesAndDirectories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class p4ExtractIntegers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "E:\\folder\\input.txt";

        PrintWriter writer = new PrintWriter("E:\\folder\\output.txt");
        String inputString = Files.readString(Path.of(path));

        List<String> outputList = Arrays.stream(inputString.split("[, ]")).collect(Collectors.toList());
        List<String> numbers = new ArrayList<>();
        for (String element : outputList) {
            char[] currentElement = element.toCharArray();
            for (char e : currentElement) {
                if (Character.isDigit(e)) {
                    numbers.add(element);
                    break;
                }
            }
        }
        for (String element : numbers) {
            writer.println(element);
            System.out.println(element);
        }
        writer.close();
    }
}
