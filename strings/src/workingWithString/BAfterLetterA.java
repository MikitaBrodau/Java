package workingWithString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Task 2.2, В строке вставить после каждого символа 'a' символ 'b'.
public class BAfterLetterA {
    public static String addLetterB(String needB) {
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher(needB);
        while (matcher.find()){
            needB = matcher.replaceAll(matcher.group()+"b");
        }
        return needB;
    }

}
