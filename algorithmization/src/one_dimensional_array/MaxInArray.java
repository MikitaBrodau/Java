package one_dimensional_array;

import java.util.Arrays;

public class MaxInArray {
    public void MaxInArray(int[]a){
        int max = 0;
        int mid =a.length/2;
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <= mid; i++) {
            max = Math.max(a[i], a[a.length-i-1]);
            System.out.println(max);
        }
    }
}
