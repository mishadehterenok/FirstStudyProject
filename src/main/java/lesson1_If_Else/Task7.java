package lesson1_If_Else;

public class Task7 {
    public static void main(String[] args) {
        int b, a = 1571;
        String pro = " Программист";
        b = a % 10;
        if ((a >= 5) && (a <= 20)) {
            System.out.println(a + pro + "ов");
        } else if ((a == 1) || (b == 1)) {
            System.out.println(a + pro);
        } else if (((a > 1) && (a <= 4)) || ((b > 1) && (b <= 4))) {
            System.out.println(a + pro + "a");
        } else {
            System.out.println(a + pro + "ов");
        }
    }
}
