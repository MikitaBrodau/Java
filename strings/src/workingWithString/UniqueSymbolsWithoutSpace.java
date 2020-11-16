package workingWithString;
/* Task 2.7 Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 Например, если было введено "abc cde def", то должно быть выведено "abcdef".*/
public class UniqueSymbolsWithoutSpace {
    public static String unique(String str)
    {
        StringBuilder sb = new StringBuilder();
        str = str.replaceAll("\\s+", "");
        str.chars().distinct().forEach(c -> sb.append((char) c));
        return sb.toString();
    }
}
