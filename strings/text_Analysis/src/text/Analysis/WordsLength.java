package text.Analysis;

public class WordsLength {
    public static String split(String str) {
        String[] causes = str.split("\n{2,}");
        StringBuilder sb = new StringBuilder();
        for (String cause : causes) {
            sb.append(divide(cause)).append("\n");
        }
        return sb.toString();
    }

    public static String divide(String str) {
        String[] paragraph = str.split("([\\w]+[.])");
        StringBuilder sb = new StringBuilder();
        for (String s : paragraph) {
            sb.append(divideAndSwap(s));
        }
        return sb.toString();
    }

    private static String divideAndSwap(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() < words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        for (String word : words) {
            sb.append(word).append(" ");
        }
        return sb.toString();
    }
}
