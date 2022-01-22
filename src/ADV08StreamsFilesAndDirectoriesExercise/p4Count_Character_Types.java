package ADV08StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class p4Count_Character_Types {
    public static void main(String[] args) throws IOException {
        String path = "D:\\folder\\input.txt";

        PrintWriter writer = new PrintWriter("D:\\folder\\output.txt");

        List<String> inputList = Files.readAllLines(Path.of(path));
        StringBuilder input = new StringBuilder();
        for (String line : inputList) {
            input.append(line);
        }
        String vowels = "aeiou";
        String punctuation = "!,.?";
        String space = " ";
        int sumVowels = 0;
        int sumConsonants = 0;
        int sumPunctuation = 0;

        for (int i = 0; i < input.toString().length(); i++) {
            String currentSymbol = "" + input.charAt(i);
            if (vowels.contains(currentSymbol)) {
                sumVowels++;
            } else if (punctuation.contains(currentSymbol)) {
                sumPunctuation++;
            } else if (space.contains(currentSymbol)) {
                continue;
            } else {
                sumConsonants++;
            }
        }
        writer.println("Vowels: " + sumVowels);
        writer.println("Consonants: " + sumConsonants);
        writer.println("Punctuation: " + sumPunctuation);
        writer.close();
    }
}