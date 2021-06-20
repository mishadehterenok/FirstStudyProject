package lesson3_4_Arrays;

import java.util.Random;
import java.util.Scanner;

public class MultiArrTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Type the size: ");
        int size = in.nextInt();
        int [][] arr = new int [size][size];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ran.nextInt(51);
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size-1-i ; j++) {
                if (arr[i][j]%2==0 && arr[i][j]!=0){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Sum of elements which stand above the extra diagonal = " + sum);
    }
}
