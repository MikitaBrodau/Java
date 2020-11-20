package stringAsArray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Task #3, В строке найти количество цифр.
public class DigitsNumbersEntry {
    public static int entry(String str){
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while(matcher.find()){
            count++;
        }
        return count;
    }
    public static int entryWithoutRegex(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) counter++;
        }
        return counter;
    }
}
