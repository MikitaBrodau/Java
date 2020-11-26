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
    public static int spaceWithoutRegex(String words){
        int max = 0;
        for (int i = 0; i < words.length(); i++) {
            int counter = 0;
            if (Character.isWhitespace(words.charAt(i))){
                while(i < words.length() && Character.isWhitespace(words.charAt(i))){
                    counter++;
                    i++;
                }
                if (counter > max) max = counter;
            }
        }
        return max;
    }
}
