package Lesson2_Cycles;

public class Task9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%3d ", i * j);
            }
            System.out.println();
        }
    }
}
