package text.Analysis;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsLength {
    public static String split(String str) {
        String[] causes = str.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String cause : causes) {
            sb.append(divide(cause));
        }
        return sb.toString();
    }

    public static String divide(String str) {
        Pattern pattern = Pattern.compile("([^.]+)([!\\?.])");
        Matcher matcher = pattern.matcher(str);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) sb.append(sorting(matcher.group(1))).append(matcher.group(2)).append("\n");
        return sb.toString();
    }

    public static String sorting(String str) {
        List<String> list = Arrays.asList(str.split("\\s+"));
        list.sort(Comparator.comparingInt(String::length).reversed());
        StringBuilder sb = new StringBuilder();
        for (String s : list) sb.append(s).append(" ");
        return sb.toString();
    }
}
