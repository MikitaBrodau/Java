package workingWithString;
/*Task 2.6 Из заданной строки получить новую, повторив каждый символ дважды.*/
public class RepeatSymbol2Times {
    public static String repeat (String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i)).append(str.charAt(i));}
        return sb.toString();
    }
}
