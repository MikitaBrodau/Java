package dragon.cave;

import File.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NameGeneration {
    private static String genName(){
        StringBuilder names = new StringBuilder();
        try (BufferedReader bf = new BufferedReader(new FileReader("src\\dragon\\cave\\NameGenerator.txt"))){
            names.append(bf.readLine());
        }
        catch (NullPointerException | IOException e){
            e.printStackTrace();
        }
        return names.toString();
    }

    private static String name(){
        String names = genName();


        return names;
    }
    public static void main(String[] args) {
        System.out.println(name());
    }
}
