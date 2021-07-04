package lesson12_Collections.polinomials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static final int MAX_POWER = 6;
    public static void main(String[] args) {

        Map<Integer, Integer> firstPolynomial = new HashMap<>();
        firstPolynomial.put(6, 2);
        firstPolynomial.put(5, 1);
        firstPolynomial.put(4, 6);
        firstPolynomial.put(3, 0);
        firstPolynomial.put(2, 7);
        firstPolynomial.put(1, 2);
        firstPolynomial.put(0, 3);
        System.out.println(printPolynomial(firstPolynomial));

        Map<Integer, Integer> secondPolynomial = new HashMap<>();
        secondPolynomial.put(6, 1);
        secondPolynomial.put(5, 5);
        secondPolynomial.put(4, 0);
        secondPolynomial.put(3, 1);
        secondPolynomial.put(2, 3);
        secondPolynomial.put(1, 1);
        secondPolynomial.put(0, 8);
        System.out.println(printPolynomial(secondPolynomial));

        System.out.println(printPolynomial(sum(firstPolynomial,secondPolynomial)));
    }

    private static Map<Integer,Integer> sum (Map<Integer,Integer> first, Map<Integer,Integer> second){
        Map<Integer,Integer> result = new HashMap<>();
        for (int i = MAX_POWER; i>= 0; i--){
            result.put(i,first.get(i) + second.get(i));
        }
        return result;
    }

    private static String printPolynomial(Map<Integer, Integer> polynomial) {
        List<String> list = new ArrayList<>();
        for (int i = MAX_POWER; i >= 0; i--) {
            Integer currentValue = polynomial.get(i);
            if (currentValue == 0){
                continue;
            }
            if (i == 0){
                list.add(String.valueOf(currentValue));
            } else if (i == 1 ){
                list.add(currentValue == 1 ? "x" : currentValue + "x");
            } else {
                list.add(currentValue == 1 ? "x^" + i : currentValue + "x^" + i);
            }
        }
        return String.join(" + ", list);

    }

}
