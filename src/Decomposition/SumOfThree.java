package Decomposition;

import java.util.ArrayList;
import java.util.List;

public class SumOfThree {
    public static List<Integer> SumOfThree(int[] arr){
        if (arr.length % 3 != 0) throw  new IllegalArgumentException("Probably better if your array will be aliquot 3");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length-2; i = i+3 ){
            list.add(arr[i]+arr[i+1]+arr[i+2]);
        }
        return list;
    }
}
