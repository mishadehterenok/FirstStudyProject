package lesson13_14_lambda_sream.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1234","12434","123","12");
        strings.sort(Comparator.comparingInt(String::length));
        strings.forEach(System.out::println);
        doSmth(() -> System.out.println("I'm starting"));
        doSmth(()-> System.out.println("I'm working"));

        List<String> words = Arrays.asList("lol","apple","kek","pop","bang","sort");
        words.stream()
                .filter(Test::isPalindrome)
                .forEach(System.out::println);


        int result = doSum((a,b)->a*b,5,10);
        System.out.println(result);

        Operation operation = (x,y)->x+y;
        int res = operation.sum(5,2);
        System.out.println(res);

    }

    private static boolean isPalindrome(String word){
        StringBuilder builder = new StringBuilder(word);
        return word.equalsIgnoreCase(builder.reverse().toString());
    }



    private static void doSmth(Worker worker){
        worker.start();
    }
    private static int doSum(Operation op,int a,int b){
        return op.sum(a,b);
    }
}
@FunctionalInterface
interface Worker {
    void start();
}
@FunctionalInterface
interface Operation {
    int sum(int a,int b);
}


