package ADV08StreamsFilesAndDirectoriesExercise;

import java.io.File;
import java.util.Scanner;

public class p8GetFolderSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\folder\\Exercises Resources";
        File folder = new File(path);
        File[] allFiles = folder.listFiles();

        int folderSize = 0; //размер на папката
        for (File file : allFiles) {
            folderSize += file.length();
        }

        System.out.println("Folder size: " + folderSize);
    }
}
