package lesson12_Collections.uniqueCount;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(2,3,3,4,7,7,1,2,45,23,45,6);
        System.out.println(countUnique(numbers));
    }
    public static int countUnique (List<Integer> numbers){
        return new HashSet<>(numbers).size();
    }
}
