package Decomposition;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Decomposition.NumberInArray.transformInArray;

public class SumOfKAndLowerThenN {
    public static List<Integer> summary(int k, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if(search(i,k)){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean search(int number, int k){
        int[] j = transformInArray(number);
        int sum = UnevenNumbers.sum(j);
        return sum == k;
    }
}