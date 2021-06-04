package lesson3_Arrays;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] mass = new int [4];
        Random ran = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ran.nextInt(11);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < mass.length-1; j++) {
            if (mass[j]<mass[j+1]){
                if (j== mass.length-2){
                    System.out.println("Array is strictly ascending sequence");
                }
            }
            else {
                System.out.println("Array isn't strictly ascending sequence");
                break;
            }
        }
    }
}
