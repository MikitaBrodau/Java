package one_dimensional_array;

import java.util.Arrays;

public class MaxInArray {
    public void MaxInArray(int[]a){
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i+=4) {
            int max = Math.max(sum(a[i],a[i+1]), sum(a[i+2],a[i+3]));
            System.out.println(max);
        }
    }
    private static int sum(int a, int b){
        return a + b;
    }
}
