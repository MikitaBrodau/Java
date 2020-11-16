package stringAsArray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Task #1, Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class CamelCaseSnake_Case {
    public static String[] splitString(String[] camel) {
        String[] snake = new String[camel.length];
        for (int i = 0; i < camel.length; i++) {
            snake[i] = splitStringRegular(camel[i]);
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
}
