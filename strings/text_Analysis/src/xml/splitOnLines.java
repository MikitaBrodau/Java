package xml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class splitOnLines {
    public static String[] split(String str) {
        String[] xml = str.trim().split("\r\n");
        for (int i = 0; i < xml.length; i++) {
            System.out.println();
            check(xml[i]);
        }
        return xml;
    }

    private static void check(String str) {
        Pattern pattern = Pattern.compile("(<[^/].+>)(.+?)?(<.+>)|(<.+[/]>)|(<[^/].+>)", Pattern.DOTALL | Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print("Open tag: " + matcher.group(5));
            System.out.print("\tOpen content tag: " + matcher.group(1));
            System.out.print("\tContent tag: " + matcher.group(2));
            System.out.print("\tClose content tag: " + matcher.group(3));
            System.out.print("\tEmpty body tag: " + matcher.group(4));


//        if (!matcher.find()){
//            Pattern pattern1 = Pattern.compile("(<.+[/]>)");
//            matcher = pattern1.matcher(str);
//            while(matcher.find()){
//                System.out.println("Empty body tag: " + matcher.group());
//            }
//        }
        }
    }
}