package xml;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main {
    public static void main(String[] args) {
        Path path = Paths.get("src\\xml\\text.xml");
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(Files.readString(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = sb.toString();
        splitOnLines.split(text);
    }
}
