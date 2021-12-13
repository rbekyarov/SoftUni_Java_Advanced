package ADV07StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;


public class p1ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "E:\\folder\\input1.txt";
        FileInputStream input = new FileInputStream(path);
        // Scanner scanner = new Scanner(input);
        // String output = scanner.nextLine();
        int oneByte = input.read();
        while (oneByte >= 0) {
            System.out.print(Integer.toBinaryString(oneByte) + " ");
            oneByte = input.read();
        }
    }
}
