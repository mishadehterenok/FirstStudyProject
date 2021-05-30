package Lesson3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Dop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Type array size: ");
        int size = sc.nextInt();
        while (size <= 0) {
            System.out.print("You typed the wrong size! Try again: ");
        }
        int composition = 1;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ran.nextInt(26);
            System.out.print(arr[i] + " ");
            if (arr[i] % 3 == 0) {
                composition*=arr[i];
            }
        }
        System.out.println();
        System.out.println("Composition of elements that are multiples of 3 = " + composition);
    }
}
