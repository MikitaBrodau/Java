package dragon.cave;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConditionalMethods {

    private static final int MAX = 12000;
    private static int[] dp = new int[MAX + 1];
    private static List<Treasure> done = new ArrayList<>();
    private static List<Treasure> treasuresOnSum = new ArrayList<>();

    private static int countMinCoins(int n, List<Treasure> list) {
        if (n == 0) {
            dp[0] = 0;
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }
        int ret = Treasure.highestPrice(list).getPrice();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() <= n && !done.contains(list.get(i))) {
                done.add(list.get(i));
                int x = countMinCoins(n - list.get(i).getPrice(), list);
                if (x != Integer.MAX_VALUE)
                    ret = Math.min(ret, 1 + x);
            }
        }
        dp[n] = ret;
        return ret;
    }

    private static List<Treasure> findSolution(int n, List<Treasure> list) {
        if (n == 0) {
            return treasuresOnSum;
        }
        for (int i = 0; i < list.size(); i++) {
            if (n - list.get(i).getPrice() >= 0
                    && dp[n - list.get(i).getPrice()] + 1 == dp[n]
                    && !treasuresOnSum.contains(list.get(i))) {
                treasuresOnSum.add(list.get(i));
                findSolution(n - list.get(i).getPrice(), list);
                break;
            }
        }
        return treasuresOnSum;
    }

    static List<Treasure> countMinCoinsUtil(int x, List<Treasure> list) {
        Arrays.fill(dp, -1);
        int isPossible = countMinCoins(x, list);
        // If no solution exists
        if (isPossible == Integer.MAX_VALUE) {
            System.out.print("-1");
        } else {
            findSolution(x, list);
        }
        return treasuresOnSum;
    }
}
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
