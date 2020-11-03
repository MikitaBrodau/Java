package one_dimensional_array;

import java.util.Arrays;

public class SecondArrayNumber {
    public void KillArray(int[]a){
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0){
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
