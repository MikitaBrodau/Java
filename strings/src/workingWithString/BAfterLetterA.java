package workingWithString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Task 2.2, В строке вставить после каждого символа 'a' символ 'b'.
public class BAfterLetterA {
    public static String addLetterB(String needB) {
        return needB.replaceAll("a", "ab");
    }
    public static String addLetterBWithoutRegex(String needB){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < needB.length(); i++) {
            sb.append(needB.charAt(i));
            if (needB.charAt(i) == 'A' || needB.charAt(i) == 'a'){
                sb.append('b');
            }
        }
        return sb.toString();
    }

}
