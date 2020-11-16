package workingWithString;
//task 2.3, Проверить, является ли заданное слово палиндромом.
public class isPalindrome {
    public static boolean palindrome(String word){
        int length = word.length();
        for (int i = 0; i < length/2; ++i) {
            if(word.charAt(i) != word.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
    // also it can be done using reverse and equals method. but that solution had more complexity.
}
