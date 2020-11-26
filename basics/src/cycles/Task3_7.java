package cycles;
import java.util.*;

public class Task3_7 {
    private Set<Character> SetOfDigits(Set<Character> digits1, Set<Character> digits2) {
        digits1.retainAll(digits2);
        return digits1;
    }
    private Set<Character> digits(int number){
        Set<Character> digits = new HashSet<>();
        String a = Integer.toString(number);
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            digits.add(c);
        }
        return digits;
    }

    public Set<Character> Task3_7() {
        Scanner sc = new Scanner(System.in);
        Set<Character> digits1 = digits(sc.nextInt());
        Set<Character> digits2 = digits(sc.nextInt());
        return SetOfDigits(digits1,digits2);
    }
}

    //У меня есть два числа
    //
