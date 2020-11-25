package workingWithString;

import java.util.regex.Pattern;

//task 2.4, С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Cake {
    public static String cake() {
        String inform = "Информатика";
        String cake = String.valueOf(inform.charAt(inform.indexOf('т')));
        cake += String.valueOf(inform.charAt(inform.indexOf('о')));
        cake += String.valueOf(inform.charAt(inform.indexOf('р')));
        cake += String.valueOf(inform.charAt(inform.indexOf('т')));
        return cake;
    }
}