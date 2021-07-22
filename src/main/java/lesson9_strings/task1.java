package lesson9_strings;

public class task1 {
    public static void main(String[] args) {
        String str = "Keep going";
        System.out.println(str.substring(str.indexOf("g"),str.indexOf("o")+1));
    }

}
