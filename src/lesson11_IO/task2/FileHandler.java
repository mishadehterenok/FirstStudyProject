package lesson11_IO.task2;

import java.io.*;

public class FileHandler {
    public static String[] ReadFile(String filePath) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.ready()) {
                builder.append(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] split = builder.toString().split("\\s*(,|!|\\?|...|\\.)\\s*");
        return split;
    }

    public static boolean HavePalindrome(String line) {
        StringBuilder builder = new StringBuilder(line);
        String[] stringArr = line.split("\\s*(\\s|,|–|:|;)\\s*");
        for (String word : stringArr) {
            if (word.equalsIgnoreCase(builder.reverse().toString())) {
                break;
            }
        }
        return true;
    }

    public static boolean RightCountOfWords(String line) {
        String[] words = line.split("\\s*(\\s|,|–|:|;)\\s*");
        if (words.length < 3 || words.length > 5) {
            return false;
        }
        return true;
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
