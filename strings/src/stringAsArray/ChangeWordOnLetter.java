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
        String[] words = word.split("\\s");
        for (int i = 0; i < words.length; i++) {
            sb.append(divide(words[i].toLowerCase())).append(" ");
        }
        return sb.toString().toLowerCase();
    }

    private static String divide(String word) {
        char[] div = {'w','o','r','d'};
        int counter = 0;
        for (int i = 0; i < div.length; i++) {
            if (word.charAt(i) == div[i]){
             counter++;
            }
            else return word;
            if (counter == 4) return "letter";
        }
        return word;
    }
}
