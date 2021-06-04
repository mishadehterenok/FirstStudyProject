package lesson3_Arrays;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int [] mass = new int [12];
        Random ran = new Random();
        int max = 0;
        int k = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ran.nextInt(16);
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        for (int j = 0; j < mass.length; j++) {
            if (mass[j]>=max){
                max= mass[j];
                k= j;
            }
        }
        System.out.println("The maximum element in array: " + max);
        System.out.println("The index of the last entry in the array: " + k);
    }
}
