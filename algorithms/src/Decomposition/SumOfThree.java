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
        for (int i = 1; i < arr.length - 1; i += 3) {
            list.add(arr[i - 1] + arr[i] + arr[i + 1]);
        }
        return list;
    }
}
