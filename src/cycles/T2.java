package cycles;

public class T2 {
    public static void main(String[] args) {
        int population = 10000000;
        int born = 14;
        int death = 8;
        int years = 10;
        int dif = born - death;
        for (int i = 0; i < years; i++) {
            population += population * dif / 1000;
            if (born > 7) {
                born--;
            }
            if (death > 6) {
                death--;
            }
        }
        System.out.println(population);
    }
}
