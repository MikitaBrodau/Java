package one_dimensional_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinOrder {
    public List<Integer> MinOrder(int[] a) {
        ArrayList<Integer> b = new ArrayList<>();
        System.out.println(Arrays.toString(a));
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] < min) min = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] == min) continue;
            b.add(a[i]);
        }
        return b;
    }
}
