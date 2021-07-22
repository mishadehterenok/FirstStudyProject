package lesson9_strings.oneSentenceOneLine;

import java.io.*;
import java.util.Scanner;

public class RunText {
    public static void main(String[] args) {
        final String DIRECTORY = "src" + File.separator + "lesson9_strings" + File.separator + "task4" + File.separator;
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(DIRECTORY + "OriginalFile.txt")))) {
            while (scanner.hasNextLine()) {
                TextFormater.oneSentenceOneLine(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
