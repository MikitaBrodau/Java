package one_dimensional_array;

import java.util.ArrayList;
import java.util.List;

public class MinOrder {
    public List MinOrder (int[] a){
        List<Integer> b = new ArrayList<>();
        int m = 0;
        for (int j : a) {
            if (m > j) m = j;
        }
        for (int j : a) {
            if (j == m) continue;
            b.add(j);
        }
        return b;
    }
}
