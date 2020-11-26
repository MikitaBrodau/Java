package workingWithString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* Task 2.8 Вводится строка слов, разделенных пробелами.
 Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.*/
public class LongestWord {
    public static String longestOne(String str){
        Pattern pattern = Pattern.compile("(\\w+)");
        Matcher matcher = pattern.matcher(str);
        String longOne = "";
        while (matcher.find()){
            String string = matcher.group(1);
            if(string.length() > longOne.length()) longOne = string;
        }
        return longOne;
    }
    public static String longestOneWithoutRegex(String str) {
        String max = "";
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            if (Character.isAlphabetic(str.charAt(i))){
                while (i < str.length() && Character.isAlphabetic(str.charAt(i))){
                    sb.append(str.charAt(i));
                    i++;
                }
                if(sb.length() > max.length()) max = sb.toString();
            }
        }
        return max;
    }
}
