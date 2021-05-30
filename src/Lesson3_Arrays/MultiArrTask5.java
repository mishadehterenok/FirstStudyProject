package Lesson3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class MultiArrTask5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Type the sizes: ");
        int size = in.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = ran.nextInt(51);
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose...");
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                    int a = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = a;
                }
            }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
