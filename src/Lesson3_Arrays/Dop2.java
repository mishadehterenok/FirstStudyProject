package Lesson3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Dop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
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
            if (i % 2 != 0 && i!=0) {
                sum+=arr[i];
                count++;
            }
        }
        System.out.println();
        System.out.println("Arithmetic mean of elements with odd indexes " + (double) sum/count);
    }
}