package lesson2_Cycles;

public class Task5 {
    public static void main(String[] args) {
        double sm;
        for (int i = 1; i <= 20; i++) {
            sm = i * 2.54;
            System.out.printf("%d сантиметров = %.2f дюйма \n", i, sm);
        }
    }
}
