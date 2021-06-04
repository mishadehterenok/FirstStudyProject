package lesson2_Cycles;

public class Task4 {
    public static void main(String[] args) {
        int a = 12;
        int b = 4;
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        System.out.println(result);
    }
}
