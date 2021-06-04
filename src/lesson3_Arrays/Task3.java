package lesson3_Arrays;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int kol = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                kol++;
            }
        }
        System.out.println("Всего четных чисел :"+kol);
    }
}
