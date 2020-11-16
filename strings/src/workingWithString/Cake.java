package workingWithString;

import java.util.regex.Pattern;

//task 2.4, С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Cake {
    public static String cake() {
        String inform = "Информатика";
        StringBuilder sb = new StringBuilder();
        char[] cake = {inform.charAt(7), inform.charAt(3), inform.charAt(4), inform.charAt(7)};
        return new String(cake);
    }
}