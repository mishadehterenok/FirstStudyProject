package lesson11_IO.task1.service;

import java.io.*;

public class FileWorker {
    public static String[] readFile(String fileName) {
        String result = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder builder = new StringBuilder();
            //String line;
            //while ((line = reader.readLine()) != null)
            while ((reader.ready())) {
                builder.append(reader.readLine()).append("\n");
            }
            result = builder.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.split("\n");
    }

    public static void writePalindromes(String fileName, String[] lines) {
        try (BufferedWriter writer = new BufferedWriter((new FileWriter(fileName)))) {
            for (String line : lines) {
                if (isPalindrom(line)) {
                    writer.write(line + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isPalindrom(String line) {
        StringBuilder builder = new StringBuilder(line);
        if (line.equalsIgnoreCase(builder.reverse().toString())) {
            return true;
        }
        return false;

    }
}
