package Lesson2_Cycles;

public class Task1 {
    public static void main(String[] args) {
        double distance = 10;
        double percent = 0.1;
        double total = distance;
        for (int i = 2; i <= 7; i++) {
            distance += distance * percent;
            System.out.printf("%d day %.2f", i, distance);
            System.out.println();
            total += distance;
        }
        System.out.printf("total distance = %.2f", total);
    }
}
