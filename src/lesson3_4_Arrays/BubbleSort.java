package lesson3_4_Arrays;
import java.util.Scanner;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Создаём объект типа Scanner
        Random r = new Random(); // Создаём объект типа Random
        System.out.println("Длина массива:");
        int n = sc.nextInt();// Вводим длину массива с клавиатуры
        System.out.println();
        int mass[] = new int[n]; // создаём одномерный массив длиной = n
        for (int i = 0; i < n; i++) {
            mass[i] = r.nextInt(9); // заполняем массив случайными числами от 0 до 9
        }
        System.out.println("Массив без изменений");
        for (int i = 0; i < n; i++) {
            System.out.print(mass[i] + " "); // выводим массив на экран
        }
        System.out.println();
        System.out.println();
        int min = mass[0];
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) { //находим min и max
                min = mass[i];
            }
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println("max=" + max + " min=" + min);
        System.out.println();
        System.out.println("Сортировка пузырьком");
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] < mass[j + 1]) {
                    int value = mass[j];
                    mass[j] = mass[j + 1]; //сортировка массива пузырьком
                    mass[j + 1] = value;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
