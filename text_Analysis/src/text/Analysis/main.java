package text.Analysis;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Path source = Paths.get("src\\text\\Analysis\\song.txt");
        try {
            sb.append(Files.readString(source));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = sb.toString();
        System.out.println(ParagraphSort.paragraphs(text));
        System.out.println(WordsLength.split(text));
        LexemeSort lexemeSort = new LexemeSort();
        System.out.println(lexemeSort.divideOnClauses(text, 'о'));
    }
}
