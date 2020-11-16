package stringAsArray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Task 5, Удалить в строке все лишние пробелы,
то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.*/
public class DelSpace {
    public static String del(String space){
        Pattern pattern = Pattern.compile("\\s++");
        Matcher matcher = pattern.matcher(space.trim());
        while (matcher.find()){
            space = matcher.replaceAll(" ");
        }
        return space;
    }
}
