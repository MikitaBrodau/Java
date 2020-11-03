package one_dimensional_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinOrder {
    public List MinOrder(int[] a) {
        ArrayList<Integer> b = new ArrayList<>();
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i += 2) {
            b.add(Math.min(a[i], a[i+1]));
        }
        return b;
    }
}
