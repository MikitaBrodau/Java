package dragon.cave;

import dragon.cave.treasures.Treasure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreasuresOnSomeSum {

    private static final int MAX = 12000;
    private static final int[] dp = new int[MAX + 1];
    private static final List<Treasure> done = new ArrayList<>();
    private static final List<Treasure> treasuresOnSum = new ArrayList<>();

    private static int countMinCoins(int n, List<Treasure> list) {
        if (n == 0) {
            dp[0] = 0;
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }
        int ret = highestPrice(list).getPrice();

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
        if (isPossible == Integer.MAX_VALUE) {
            System.out.print("-1");
        } else {
            findSolution(x, list);
        }
        return treasuresOnSum;
    }

    public static Treasure highestPrice(List<Treasure> list) {
        Treasure max = list.get(0);
        for (Treasure t :
                list) {
            if (t.getPrice() > max.getPrice()) max = t;
        }
        return max;
    }
}

