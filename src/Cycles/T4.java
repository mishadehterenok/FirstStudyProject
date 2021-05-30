package Cycles;

public class T4 {
    public static void main(String[] args) {
        float contribution = 100f;
        float percent = 0.07f;
        float result = contribution;
        int months = 3;
        while (months > 0){
            result+=contribution*percent;
            months--;
        }
        System.out.println("Сумма вклада: "+contribution);
        System.out.println("Срок вклада в месяцах: "+months);
        System.out.printf("После %d месяцев сумма вклада составит %.2f \n", months,result);
    }
}
