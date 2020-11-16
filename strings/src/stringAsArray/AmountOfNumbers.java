package stringAsArray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Task 4,  В строке найти количество чисел.
public class AmountOfNumbers {
    public static int amount(String numbers){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(numbers);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
