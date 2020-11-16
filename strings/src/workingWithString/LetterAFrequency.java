package workingWithString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Task 2.5 Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.*/
public class LetterAFrequency {
    public static int frequency(String str){
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
