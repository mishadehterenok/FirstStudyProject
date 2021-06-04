package lesson3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Dop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Type the number: ");
        int c = sc.nextInt();
        System.out.print("Type array size: ");
        int size = sc.nextInt();
        while (size <= 0) {
            System.out.print("You typed the wrong size! Try again: ");
        }
        int count = 0;
        int sum = 0;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ran.nextInt(26);
            System.out.print(arr[i] + " ");
            if (arr[i]>c) {
                sum+=arr[i];
                count++;
            }
        }
        System.out.println();
        System.out.printf("Arithmetic mean of elements which more than %d :%f ", c, (double) sum/count);

    }
}
