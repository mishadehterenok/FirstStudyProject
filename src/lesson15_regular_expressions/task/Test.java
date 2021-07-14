package lesson15_regular_expressions.task;


public class Test {
    public static void main(String[] args) {
        Integer s = 4;
        if (s.toString() == s.toString()) {
            System.out.println("true");
        } else System.out.println("false");

        Integer i1 = 10;
        Integer i2 = 10;

        Double d1 = 10d;
        Double d2 = 10d;

        System.out.println(i1 == i2);
        System.out.println(d1 == d2);

        Integer ii = 1000;
        Integer jj = 2000;

        System.out.println((ii * 2 == jj) ? "yes" : "no");
        System.out.println((jj / 2 == ii) ? "yes" : "no");

    }
}
