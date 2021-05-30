package Lesson1_If_Else;

public class Task2 {
    public static void main(String[] args) {
        int a = 6444444, b = 2644, c = 115;
        if ((a + b < c) || (a + c < b) || (c + b < a)) {
            System.out.println("Треугольника с такими сторонами не существует!");
        } else {
            System.out.println("Треугольник с такими сторонами существует!");
        }
    }
}
