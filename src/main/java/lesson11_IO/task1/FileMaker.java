package lesson11_IO.task1;

import lesson11_IO.task1.service.FileWorker;

public class FileMaker {
    public static void main(String[] args) {
        String[] file = FileWorker.readFile("src/lesson11_IO/task1/InitialFile.txt");
        FileWorker.writePalindromes("src/lesson11_IO/task1/NewFile.txt",file);
    }
}
