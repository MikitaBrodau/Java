package one_dimensional_array;

import java.util.Arrays;

public class MaxInArray {
    public int MaxInArray(int[]a){
        System.out.println(Arrays.toString(a));
        int max = a[0] + a[1];
        for (int i = 2; i < a.length; i+=2) {
            if(a[i]+a[i+1] > max) max = a[i] + a[i+1];
        }
        System.out.println(max);
        return max;
    }
}
