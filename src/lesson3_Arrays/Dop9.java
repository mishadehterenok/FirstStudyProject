package lesson3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Dop9 {
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
        int min = arr[2];
        for (int i = 2; i < size; i+=2) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("The smallest element among the elements with even indexes = " + min);
    }
}
