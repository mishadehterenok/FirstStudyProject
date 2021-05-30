package Lesson3_Arrays;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        int[] mass1 = new int[5];
        int[] mass2 = new int[5];
        Random ran = new Random();
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = ran.nextInt(8) + 1;
            System.out.print(mass1[i] + " ");
            sum1 += mass1[i];
        }
        sum1 /= mass1.length;
        System.out.println(" - average " + sum1);
        for (int j = 0; j < mass2.length; j++) {
            mass2[j] = ran.nextInt(8) + 1;
            System.out.print(mass2[j] + " ");
            sum2 += mass2[j];
        }
        sum2 /= mass2.length;
        System.out.println(" - average " + sum2);
        if (sum1 > sum2) {
            System.out.println("The average of the elements of the FIRST array is greater");
        } else if (sum1 < sum2) {
            System.out.println("The average of the elements of the SECOND array is greater");
        } else {
            System.out.println("The average of the elements of both arrays are equal");
        }
    }
}
