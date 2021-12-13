package ADV07StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class p2WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "E:\\folder\\input.txt";
        String tableRemove = ",.!?";
        FileInputStream fileStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("output.txt");
        Scanner scanner = new Scanner(fileStream);
        while (scanner.hasNext()) {
            String text = scanner.nextLine();
            for (int i = 0; i < text.length(); i++) {
                char symbol = text.charAt(i);
                if (!tableRemove.contains(String.valueOf(symbol))) {
                    outputStream.write(symbol);
                }
            }
            outputStream.write('\n');
        }
    }
}
