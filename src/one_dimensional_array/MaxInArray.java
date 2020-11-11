package one_dimensional_array;

import java.util.Arrays;

public class MaxInArray {
    public int MaxInArray(int[]a){
        System.out.println(Arrays.toString(a));
        int max = a[0] + a[1];
        for (int i = 0; i < a.length/2; i++) {
            if(a[i]+a[a.length-1-i] > max) max = a[i]+a[a.length-1-i];
        }
        System.out.println(max);
        return max;
    }
}
