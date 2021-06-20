package lesson9_strings.task3;

import java.io.*;
import java.util.Scanner;

public class FileWorker {
    public static void main(String[] args) {
        File newFile = new File("src/lesson9_strings/task3/NewFile.txt");
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream("src/lesson9_strings/task3/InitialFile.txt")));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/lesson9_strings/task3/NewFile.txt"))) {
            newFile.createNewFile();
            while (scanner.hasNext()) {
                String st = scanner.next();
                StringBuilder builder = new StringBuilder(st);
                if (st.equalsIgnoreCase(String.valueOf(builder.reverse()))) {
                    bufferedWriter.write(st + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
