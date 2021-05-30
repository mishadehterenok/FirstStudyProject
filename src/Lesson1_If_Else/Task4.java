package Lesson1_If_Else;

public class Task4 {
    public static void main(String[] args) {
        int a = 4, b = -7, c = 3;
        if ((a * b * c > 0) && ((a * b < 0) || (a * c < 0))) {
            System.out.println("Одно положительное число");
        } else if ((a < 0) && (b < 0) && (c < 0)) {
            System.out.println("Положительных чисел нет");
        } else if (a * b * c < 0) {
            System.out.println("Два положительных числа");
        } else {
            System.out.println("Три положительных числа");
        }
    }
}
