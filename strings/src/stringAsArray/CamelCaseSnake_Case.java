package stringAsArray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Task #1, Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class CamelCaseSnake_Case {
    public static String[] splitString(String[] camel) {
        String[] snake = new String[camel.length];
        for (int i = 0; i < camel.length; i++) {
//            snake[i] = splitStringRegular(camel[i]);
            snake[i] = withoutRegex(camel[i]);
        }
        return snake;
    }

    public static String splitStringRegular(String camel) {
        Pattern pattern = Pattern.compile("\\p{javaUpperCase}");
        Matcher matcher = pattern.matcher(camel);
        StringBuilder snake = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(snake, "_" + matcher.group());
        }
        matcher.appendTail(snake);
        return snake.toString().toLowerCase();
    }
    public static String withoutRegex(String camel) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < camel.length(); i++) {
            char letter = camel.charAt(i);
            if (i != 0 && Character.isUpperCase(letter) && Character.isLowerCase(camel.charAt(i - 1))) {
                    sb.append("_");
                    sb.append(letter);
            }
            else sb.append(letter);
        }
        return sb.toString().toLowerCase();
    }
}
