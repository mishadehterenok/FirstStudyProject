package Lesson1_If_Else;

public class Task5 {
    public static void main(String[] args) {
        int a = 3, b = -7, c = -5;
        if ((a < 0) && (b < 0) && (c < 0)) {
            System.out.println("Три трицательных числа");
        } else if ((a * b * c < 0) && ((b * c < 0) || (a * c < 0) || (a * b < 0))) {
            System.out.println("Два положительных и одно отрицательное число");
        } else if ((a > 0) && (b > 0) && (c > 0)) {
            System.out.println("Три положительных числа");
        } else {
            System.out.println("Одно положительное и два отрицательных числа");
        }
    }
}
