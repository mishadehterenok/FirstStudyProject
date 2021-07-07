package lesson13_14_lambda_sream.task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class DemoTasks {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        double aver = nums.stream()
                .filter(num -> num % 2 == 1)
                .filter(num -> num % 5 == 0)
                .collect(Collectors.averagingInt(Integer::valueOf));
//                .mapToInt(Integer::valueOf)
//                .average().orElse(0);
        System.out.println(aver);
        String result = nums.stream()
                .map(Object::toString)
                .collect(Collectors.joining("-"));
        System.out.println(result);

        IntStream intStream = IntStream.of(3, 4, 5, 6, 7, 14, 15, 16, 17);
        double a = intStream.filter(num -> num % 2 == 1)
                .filter(num -> num % 5 == 0)
                .average().orElse(0);
        System.out.println(a);


        Stream<String> strings = Stream.of("Hello world", "aveng", "civi", "12345", "by");
        strings
                .distinct()
                .sorted(Comparator.comparing(String::length))
                .filter(str -> str.length() < 5)
                .forEach(System.out::println);

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("1234", 1);
        myMap.put("123", 2);
        myMap.put("12", 3);
        myMap.put("11223", 4);
        myMap.put("1244444", 5);
        myMap.put("125454", 6);

        int sum = myMap.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 5)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);

        List<Person> people = Arrays.asList(new Person("Ivan", "Ivanov", 16),
                new Person("Vasia", "Vasiliev", 18),
                new Person("Mike", "Michelson", 20));
        String s = people.stream()
                .filter(person -> person.fullName().length() > 10)
                .max(Comparator.comparing(Person::getAge))
                .get().fullName();
        System.out.println(s);

    }
}
class Person{
    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String fullName(){
        return firstName + " " +lastName;
    }
}
