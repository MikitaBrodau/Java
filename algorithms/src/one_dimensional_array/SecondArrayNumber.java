package one_dimensional_array;

import java.util.Arrays;

public class SecondArrayNumber {
    public void KillArray(int[] a) {
        if (a.length % 2 != 0) throw new IllegalArgumentException("Not even arr");
        for (int i = 1; i < a.length/2;i++) {
            a[i] = a[i+i];
        }
        for (int i = 0; i < a.length/2; i++) {
            a[a.length/2 + i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}