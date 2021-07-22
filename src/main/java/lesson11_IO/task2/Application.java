package lesson11_IO.task2;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        final String DIRECTION = "src" + File.separator + "lesson11_IO" + File.separator + "task2" + File.separator;
        String[] sentences = FileHandler.ReadFile(DIRECTION + "OriginalFile.txt");
        FileHandler.WriteRightSentencesInNewFile(DIRECTION + "NewFile.txt", sentences);
    }
}
