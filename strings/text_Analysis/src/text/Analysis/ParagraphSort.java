package text.Analysis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ParagraphSort {
    public static String paragraphs(String str) {
        String[] causes = str.split("\n\s+|\n\t+");
        return paragraphSort(causes);
    }

    private static int countCause(String cause) {
        Pattern pattern = Pattern.compile("[^.]+\\!|[^.]+\\?|[^.]+\\.");
        Matcher matcher = pattern.matcher(cause);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
    private static String paragraphSort(String[] str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - 1; j++) {
                if (countCause(str[j]) < countCause(str[j + 1])) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
            sb.append(str[i]).append("\n\t");
        }
        return sb.toString();
    }

}
