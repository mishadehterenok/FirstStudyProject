package Lesson3_Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] mass = new int[50];
        for (int i = 1, j = 0; i <= 99 && j < mass.length; i++) {
            if (i % 2 != 0) {
                mass[j] = i;
                j++;
            }
        }
        for (int x : mass) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }

    }
}
