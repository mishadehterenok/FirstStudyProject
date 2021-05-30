package Lesson1_If_Else;

public class Task1 {
    public static void main(String[] args) {
        int a = 58;
        if (a < 0) {
            System.out.print(a + " - это отрицательное ");
        } else if (a == 0) {
            System.out.print("ваше число НОЛЬ, ");
        } else {
            System.out.print(a + " - это положительное ");
        }
        a /= 10;
        if (a == 0) {
            System.out.println("однозначное число!");
        } else if ((a < 10) && (a > -10)) {
            System.out.println("двухзначное число!");
        } else if ((a < 100) && (a > -100)) {
            System.out.println("трехзначное число!");
        } else {
            System.out.println("число с количеством знаков больше трёх!");
        }
    }
}
