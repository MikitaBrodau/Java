package stringAsArray;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Task #2, Замените в строке все вхождения 'word' на 'letter'.
public class ChangeWordOnLetter {
    public static String wordOnLetter(String word) {
        Pattern pattern = Pattern.compile("(word)");
        Matcher matcher = pattern.matcher(word);
        while (matcher.find()) {
            word = matcher.replaceAll("letter");
        }
        return word;
    }

    public static String wordOnLetterWithoutRegex(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if(word.toLowerCase().startsWith("word", i)){
                sb.append("letter");
                i = i+3;
            }
            else sb.append(word.charAt(i));
        }
        return sb.toString().toLowerCase();
    }
}
