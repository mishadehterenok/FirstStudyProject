package lesson3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class MultiArrTask3 {
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
        int Main = 1;
        int Extra = 1;
        for (int i = 0; i < arr.length ; i++) {
                int j = i;
                Main *= arr[i][j];
                }
        for (int i = 0; i < arr.length; i++) {
                int j = arr.length - 1 - i;
                    Extra *= arr[i][j];
                }
        System.out.println("Main diagonal: "+Main);
        System.out.println("Extra diagonal: "+Extra);
        if (Main>Extra) {
            System.out.println("Main > Extra");
        } else if (Main<Extra){
            System.out.println("Main < Extra");}
        else {
            System.out.println("Main = Extra");
        }
    }
}
