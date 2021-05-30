package Lesson3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int[] arr;
        int sumLeft = 0;
        int sumRight = 0;
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Enter array size: ");
        int size = in.nextInt();
        while (size <= 0) {
            System.out.println("You typed the wrong number!");
            size = in.nextInt();
        }
            arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = ran.nextInt(16);
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (int j = 0, k = size - 1; j < size / 2 & k >= size / 2; j++, k--) {
                sumLeft += arr[j];
                sumRight += arr[k];
            }
            System.out.println("The sum of the LEFT side of the array: " + sumLeft);
            System.out.println("The sum of the RIGHT side of the array: " + sumRight);
            if (sumLeft < sumRight) {
                System.out.println("Right side is bigger!");
            } else {
                System.out.println("Left side is bigger!");
            }
        }
    }
