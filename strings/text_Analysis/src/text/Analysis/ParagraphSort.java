package text.Analysis;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ParagraphSort {
    public static String paragraphs (String str) {
        List<String>  paragraphs = Arrays.asList(str.split("\n"));
        return paragraphSort(paragraphs);
    }

    private static int countCause(String cause) {
        Pattern pattern = Pattern.compile("([^.]+)\\.");
        Matcher matcher = pattern.matcher(cause);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
    private static String paragraphSort(List<String> str){
        str.sort(Comparator.comparingInt(ParagraphSort::countCause).reversed());
        StringBuilder inString = new StringBuilder();
        for (String s : str) {
            inString.append(s).append("\n");
        }
        return inString.toString();
    }

}
