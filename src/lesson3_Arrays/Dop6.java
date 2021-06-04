package lesson3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Dop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Type array size: ");
        int size = sc.nextInt();
        boolean difference = true;
        while (size <= 0) {
            System.out.print("You typed the wrong size! Try again: ");
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ran.nextInt(26);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    difference = false;
                    break;
                }
            }
        }
        System.out.println();
        if (difference == true) {
            System.out.println("All elements are different!");
        } else {
            System.out.println("NOT all elements are different!");
        }
    }
}
