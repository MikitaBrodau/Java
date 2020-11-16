package workingWithString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Task 2.1, Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class MostOfSpaceBetweenWords {
    public static int space(String words) {
        Pattern pattern = Pattern.compile("(\\s+)");
        Matcher matcher = pattern.matcher(words);
        int max = 0;
        while (matcher.find()) {
            int count = matcher.group(1).length();
            if(count > max) max = count;
        }
        return max;
    }
}
