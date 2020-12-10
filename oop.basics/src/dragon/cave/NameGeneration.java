package dragon.cave;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class NameGeneration {
    private static String genName(){
        StringBuilder names = new StringBuilder();
        try (BufferedReader bf = new BufferedReader(new FileReader("./resources/NameGenerator.txt"))){
            while (bf.read() != -1)
                names.append(bf.readLine()).append(" ");
        }
        catch (NullPointerException | IOException e){
            e.printStackTrace();
        }
        return names.toString();
    }

    public static String getRandomName(){
        String [] s = genName().split("\s");
        return s[(int)Math.floor(Math.random()*s.length)] + " " + s[(int)Math.floor(Math.random()*s.length)];
    }
}
