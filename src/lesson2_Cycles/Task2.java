package lesson2_Cycles;

public class Task2 {
    public static void main(String[] args) {
        int ameb = 1;
        for (int i = 3; i <= 24; i += 3) {
            ameb *= 2;
            System.out.printf("через %d часов %d \n", i, ameb);
        }
    }
}
