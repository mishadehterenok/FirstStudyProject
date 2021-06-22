package lesson11_IO.task3;

import java.io.*;

public class FileHandler {
    public static boolean CheckCensorship(String sentence) {
        boolean id = false;
        String[] words = sentence.split("\\s?[,–:;]?\\s");
        for (String word : words) {
            if (CompareToCensore(word)) {
                id = true;
                break;
            }
        }
        return id;
    }

    public static boolean CompareToCensore(String word) {
        final String DIRECTION = "src" + File.separator + "lesson11_IO" + File.separator + "task3" + File.separator;
        StringBuilder builder = new StringBuilder();
        boolean id = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(DIRECTION + "BlackList.txt"))) {
            while (reader.ready()) {
                builder.append(reader.readLine()).append(" ");
            }
            String[] censoreWords = builder.toString().split("\\s");
            for (String censoreWord : censoreWords) {
                if (word.equalsIgnoreCase(censoreWord)) {
                    id = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return id;
    }

    public static String[] ReadFile(String filePath) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.ready()) {
                builder.append(reader.readLine()).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString().split("\s?[.!?…]\s*");
    }

    public static void WriteVerifiedSentencesInNewFile(String filePath, String[] sentences) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            int counter = 0;
            for (String sentence : sentences) {
                if (!CheckCensorship(sentence)) {
                    writer.write(sentence + "\n");
                } else {
                    counter++;
                    System.out.println(counter + ") " +sentence);
                }
            }
            System.out.printf("\nOnly %d sentences failed the censorship test.\n", counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
