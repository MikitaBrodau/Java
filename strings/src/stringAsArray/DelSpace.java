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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < space.length(); i++) {
            sb.append(space.charAt(i));
            if (Character.isWhitespace(space.charAt(i))) {
                while (space.charAt(i) == ' ' && Character.isWhitespace(space.charAt(i + 1))) {
                    i++;
                }
            }
        }
        return sb.toString();
    }
}
