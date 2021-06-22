package lesson11_IO.task3;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        final String DIRECTION = "src" + File.separator + "lesson11_IO" + File.separator + "task3" + File.separator;
        String [] sentences = FileHandler.ReadFile(DIRECTION + "OriginalText.txt");
        FileHandler.WriteVerifiedSentencesInNewFile(DIRECTION + "VerifiedText.txt",sentences);
    }
}
