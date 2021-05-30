package Lesson3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Dop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Type array size: ");
        int size = sc.nextInt();
        while (size <= 0) {
            System.out.print("You typed the wrong size! Try again: ");
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ran.nextInt(26);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int j = 1;
        for (int i = 1; i < size; i++) {
            if (i % 2 == 0) {
                arr[j] = arr[i];
                j++;
            } else continue;}
        for (int i = size / 2; i < size; i++) {
                arr[i] = 0;
            }
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
    }
