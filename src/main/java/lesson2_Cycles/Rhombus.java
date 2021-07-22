package lesson2_Cycles;

public class Rhombus {
    public static void main(String[] args) {
        int size = 7;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i*2; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = size*2; k >= i*2; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
