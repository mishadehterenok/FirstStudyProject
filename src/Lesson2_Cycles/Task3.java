package Lesson2_Cycles;

public class Task3 {
    public static void main(String[] args) {
        int num = 1;
        int sum = num;
        while (num != 256) {
            num *= 2;
            sum += num;
        }
        System.out.println(sum);
    }
}
