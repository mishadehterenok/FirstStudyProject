package lesson1_If_Else;

public class Task3 {
    public static void main(String[] args) {
        int a = 0;
        if (a > 0) {
            System.out.println(++a);
        } else if (a < 0) {
            System.out.println(a - 2);
        } else {
            a = 10;
            System.out.println(a);
        }
    }
}
