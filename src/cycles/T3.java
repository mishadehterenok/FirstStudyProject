package cycles;

public class T3 {
    public static void main(String[] args) {
        float contribution = 100f;
        float percent = 0.07f;
        float result = contribution;
        int months = 1;
        for (int i = 0; i < months; i++) {
            result+=contribution*percent;
        }
        System.out.println("Сумма вклада: "+contribution);
        System.out.println("Срок вклада в месяцах: "+months);
        System.out.printf("После %d месяцев сумма вклада составит %.2f \n", months,result);
    }
}
