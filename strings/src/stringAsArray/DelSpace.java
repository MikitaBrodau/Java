package stringAsArray;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Task 5, Удалить в строке все лишние пробелы,
то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.*/
public class DelSpace {
    public static String del(String space) {
        Pattern pattern = Pattern.compile("\\s++");
        Matcher matcher = pattern.matcher(space.trim());
        while (matcher.find()) {
            space = matcher.replaceAll(" ");
        }
        return space;
    }

    public static String delWithoutRegex(String space) {
        char[] chars = space.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < chars.length) {
            sb.append(chars[i]);
            if (chars[i] == ' ') {
                while (i < chars.length && chars[i] == ' ') {
                    i++;
                }
                continue;
            }
            i++;
        }
        if (sb.charAt(0) == ' ')
            sb.deleteCharAt(0);

        if (sb.charAt(sb.length() - 1) == ' ')
            sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
