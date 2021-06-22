package lesson9_strings.oneSentenceOneLine;

public class TextFormater {
    public static void oneSentenceOneLine(String st) {

        int starter = 0;
        for (int i = 0; i < st.length(); i++) {
            if ((st.charAt(i) == '!') || (st.charAt(i) == '?') || (st.charAt(i) == '.')) {
                System.out.println(st.substring(starter, i + 1));
                starter = i + 2;
            } else if (i == st.length() - 1) {
                System.out.print(st.substring(starter, i + 1) + " ");
            }
        }
    }
}

