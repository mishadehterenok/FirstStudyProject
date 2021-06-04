package lesson3_Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] mass=new int[11];
        for (int i = 1; i < mass.length; i++) {
            mass[i]=i*2;
            System.out.print(mass[i]+" ");
        }
    }
}
