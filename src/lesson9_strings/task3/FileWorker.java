package lesson9_strings.task3;

import java.io.*;
import java.util.Scanner;

public class FileWorker {
    public static void main(String[] args) {
        final String DIRECTORY = "src" + File.separator + "lesson9_strings" + File.separator + "task3" + File.separator;
        File newFile = new File(DIRECTORY + "NewFile.txt");
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(DIRECTORY + "InitialFile.txt")));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile))) {
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
