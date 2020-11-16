package stringAsArray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Task #2, Замените в строке все вхождения 'word' на 'letter'.
public class ChangeWordOnLetter {
    public static String WordOnLetter(String word){
        Pattern pattern = Pattern.compile("(word)");
        Matcher matcher = pattern.matcher(word);
        while(matcher.find()){
            word = matcher.replaceAll("letter");
        }
        return word;
    }
}
