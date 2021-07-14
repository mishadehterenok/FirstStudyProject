package lesson13_14_lambda_sream.iteratorToStream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob", "Carl");
        Iterator<String> iterator = list.iterator();
        asStream(iterator)
                .map(name -> "Hello, " + name + "!")
                .forEach(System.out::println);
    }
    public static <T> Stream<T> asStream(Iterator<T> sourceIterator) {
        Iterable<T> iterable = () -> sourceIterator;
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
