package Lesson3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Type array size (more than 3): ");
        int size = sc.nextInt();
        while (size <= 3){
            System.out.print("You typed the wrong size! Try again: ");
            size = sc.nextInt();
        }
        int [] arr = new int [size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = ran.nextInt(size+1);
            System.out.print(arr[i] + " ");
            if (arr[i] %2 == 0){
                count++;
            }
        }
        int j = 0;
        System.out.println();
        int [] arr2 = new int[count];
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0 && arr[i]!=0) {
                arr2[j] = arr[i];
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
    }
}
