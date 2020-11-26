package workingWithString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Task 2.9 Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы */
public class LettersCount {
    public static String counter(String str){
        return "Lower case = " + lowerCaseWithoutRegex(str) + "\nUpper Case = " + upperCaseWithoutRegex(str);
    }
    private static int lowerCase(String str){
        Pattern patternLowCase = Pattern.compile("[a-z]");
        Matcher matcher = patternLowCase.matcher(str);
        int countLow = 0;
        while (matcher.find()){
            countLow++;
        }
        return countLow;
    }
    private static int upperCase(String str) {
        Pattern patternHiCase = Pattern.compile("[A-Z]");
        Matcher matcher = patternHiCase.matcher(str);
        int countHi = 0;
        while(matcher.find()){
            countHi++;
        }
        return countHi;
    }

    public static int lowerCaseWithoutRegex(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static int upperCaseWithoutRegex(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
