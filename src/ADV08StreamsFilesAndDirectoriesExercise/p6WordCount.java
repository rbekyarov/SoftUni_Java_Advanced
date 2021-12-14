package ADV08StreamsFilesAndDirectoriesExercise;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;

import java.util.Map;

public class p6WordCount {
    public static void main(String[] args) throws IOException {
        String searchWord = "E:\\folder\\Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String source = "E:\\folder\\Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";

        PrintWriter writer = new PrintWriter("E:\\folder\\Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        String searchWordString = Files.readString(Path.of(searchWord));
        String sourceString = Files.readString(Path.of(source));
        Map<String, Integer> coincidenceMap = new LinkedHashMap<>();

        String[] word = searchWordString.split(" ");
        String[] sourceArr = sourceString.split(" ");

        for (int i = 0; i < word.length; i++) {
            String currentWord = word[i];
            for (int j = 0; j < sourceArr.length; j++) {
                String currentSourceWord = sourceArr[j];
                if (currentWord.equals(currentSourceWord)) {
                    if (!coincidenceMap.containsKey(currentWord)) {
                        coincidenceMap.put(currentWord, 1);
                    } else {
                        int currentCount = coincidenceMap.get(currentWord);
                        coincidenceMap.put(currentWord, 1 + currentCount);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> entry : coincidenceMap.entrySet()) {
            writer.println(entry.getKey() + " - " + entry.getValue());
        }
        writer.close();
    }
}
