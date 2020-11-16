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
}
