package lesson12_Collections.isUnique;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Ivan","Ivanov");
        map.put("Nikolai","Ivanov");
        map.put("Nikita","Abramov");

        System.out.println(isUnique(map));
    }
    public static boolean isUnique (Map<String,String> map){
        HashSet<String> strings = new HashSet<>(map.values());
        return strings.size() == map.size();
    }
}
