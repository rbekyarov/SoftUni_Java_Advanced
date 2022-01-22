package ADV07StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class p3CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String pathIn = "D:\\folder\\input.txt";
        String pathOut = "D:\\folder\\03.CopyBytesOutput.txt";

        FileInputStream in = new FileInputStream(pathIn);
        FileOutputStream out = new FileOutputStream(pathOut);

        int oneByte = in.read();
        while (oneByte >= 0) {
            if (oneByte == 32 || oneByte == 10) {
                out.write(oneByte);
            } else {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i < digits.length(); i++) {
                    out.write(digits.charAt(i));
                }
            }
            oneByte = in.read();

        }
    }
}
