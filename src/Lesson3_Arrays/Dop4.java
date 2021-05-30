package Lesson3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Dop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Type array size: ");
        int size = sc.nextInt();
        int min = 0;
        while (size <= 0) {
            System.out.print("You typed the wrong size! Try again: ");
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ran.nextInt(26);
            System.out.print(arr[i] + " ");
        }
        min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] %2 != 0 && arr[i] < min) {
                min=arr[i];
            }
        }
        System.out.println();
        System.out.println("Smallest odd element = " + min);
    }
}
