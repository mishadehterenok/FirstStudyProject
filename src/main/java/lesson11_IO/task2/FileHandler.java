package lesson11_IO.task2;

import java.io.*;

public class FileHandler {
    public static String[] ReadFile(String filePath) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.ready()) {
                builder.append(reader.readLine()).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString().split("\\s?[.!?…]\\s*");
    }

    public static boolean HavePalindrome(String sentence) {
        boolean id = false;
        String[] words = sentence.split("\\s?[,–:;\"]?\\s");
        for (String word : words) {
            StringBuilder builder = new StringBuilder(word);
            if ((word.equalsIgnoreCase(builder.reverse().toString())) && (word.length() > 1)) {
                id = true;
                break;
            }
        }
        return id;
    }

    public static boolean RightCountOfWords(String sentence) {
        boolean id = false;
        String[] words = sentence.split("\\s?[,–:;\"]?\\s");
        if ((words.length >= 3) && (words.length <= 5)) {
            id = true;
        }
        return id;
    }


    public static void WriteRightSentencesInNewFile(String filePath, String[] sentences) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String sentence : sentences) {
                if ((HavePalindrome(sentence)) || (RightCountOfWords(sentence))) {
                    writer.write(sentence + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
