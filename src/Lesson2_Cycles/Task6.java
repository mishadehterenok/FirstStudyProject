package Lesson2_Cycles;

public class Task6 {
    public static void main(String[] args) {
        int a = 0;
        while (a != 100) {
            a++;
            if (a % 2 != 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}
