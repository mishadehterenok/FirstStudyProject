package lesson15_regular_expressions.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IP4_regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(((00[1-9]|0[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}(0[1-9]|1[0-6]))$");
        Matcher matcher = pattern.matcher("243.005.196.01");
        System.out.println(matcher.find());

        Pattern pattern1 = Pattern.compile("\\d{3,}");
        Matcher matcher1 = pattern1.matcher("ekn 1234 fd 1223 dcvg 12 fv 12345");
        StringBuilder builder = new StringBuilder("");
        while (matcher1.find()){
            matcher1.appendReplacement(builder, String.valueOf(Integer.parseInt(matcher1.group())*2));
        }
        matcher1.appendTail(builder);
        System.out.println(builder);
    }

}
