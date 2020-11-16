package text.Analysis;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LexemeSort {
    public String lexeme(String str, char g) {
        Pattern pattern = Pattern.compile("([^\\s.?!]+)|(.|\\?|!)");
        Matcher matcher = pattern.matcher(str.toLowerCase());
        List<word> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(new word(matcher.group(0), count(matcher.group(), g)));
        }
        list.sort(word::compareTo);
        System.out.println(list.toString());
        return "";
    }

    private static int count(String word, char g) {
        int count = 0;
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == g)
            count++;
        }
        return count;
    }

    public class word implements Comparable {
        private final String word;
        private final int count;

        public word(String word, int count) {
            this.word = word;
            this.count = count;
        }

        @Override
        public int compareTo(Object o) {
            int temp = ((word) o).count - this.count;
            if (temp == 0) {
                return ((word) o).word.compareTo(this.word);
            }
            return temp;
        }

        @Override
        public String toString() {
            return  word;
        }
    }

}

