package lesson15_regular_expressions.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IP4_regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(((00[1-9]|0[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}(0[1-9]|1[0-6]))$");
        Matcher matcher = pattern.matcher("243.005.196.01");
        System.out.println(matcher.find());
    }

}
