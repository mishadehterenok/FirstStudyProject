package Lesson3_Arrays;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            arr1[i] = ran.nextInt(10);
            arr2[i] = ran.nextInt(10);
            arr3[i] = (double) arr1[i] / arr2[i];
            System.out.printf("%7d ", arr1[i]);
        }
        System.out.println();
        for (int j : arr2) {
            System.out.printf("%7d ", j);
        }
        System.out.println();
        for (int k = 0; k < 10; k++) {
            if (arr2[k] == 0) {
                System.out.print("  /NULL ");
                continue;
            }
            System.out.printf("  %.3f ", arr3[k]);
        }
    }
}
