package lesson3_4_Arrays;

import java.util.Random;

public class Task6_v2 {
    public static void main(String[] args) {
        int[] mass = new int [4];
        Random ran = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ran.nextInt(11);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int j = mass.length - 1; j > 0; j--) {
            if (mass[j] > mass[j - 1]) {
                if (j == 1) {
                    System.out.println("Array is strictly ascending sequence");
                }
            } else {
                System.out.println("Array isn't strictly ascending sequence");
                break;
            }
        }
    }
}
