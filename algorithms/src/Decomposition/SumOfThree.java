package Decomposition;

import java.util.ArrayList;
import java.util.List;

public class SumOfThree {
    public static List<Integer> SumOfThree(int[] arr) {
        if (arr.length % 3 != 0) throw new IllegalArgumentException("Probably better if your array will be aliquot 3");
        return sum(arr);
    }

    private static List<Integer> sum(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(calc(arr, i, i + 2));
        }
        return list;
    }

    private static int calc(int[] arr, int k, int m) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
