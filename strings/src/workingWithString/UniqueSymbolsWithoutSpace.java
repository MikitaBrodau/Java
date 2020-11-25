package workingWithString;

import java.util.HashSet;
import java.util.Set;

/* Task 2.7 Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 Например, если было введено "abc cde def", то должно быть выведено "abcdef".*/
public class UniqueSymbolsWithoutSpace {

    public static String unique(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.replaceAll("\\s+", "");
        str.chars().distinct().forEach(c -> sb.append((char) c));
        return sb.toString();
    }

    public static String uniqueWithoutRegex(String str) {
        Set<Character> unique = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) unique.add(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (char c : unique) {
            sb.append(c);
        }
        return sb.toString();
    }
}
