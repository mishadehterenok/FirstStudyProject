package lesson3_4_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Dop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int count = 0;
        System.out.print("Type a number: ");
        int number = sc.nextInt();
        System.out.print("Type array size: ");
        int size = sc.nextInt();
        while (size <= 0) {
            System.out.print("You typed the wrong size! Try again: ");
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ran.nextInt(26);
            System.out.print(arr[i] + " ");
            if (arr[i]==number){
                count++;
            }
        }
        System.out.println();
        System.out.printf("Your number occurs %d times", count);
    }
}
