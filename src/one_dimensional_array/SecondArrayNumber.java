package one_dimensional_array;

import java.util.Arrays;

public class SecondArrayNumber {
    public void KillArray(int[]a){
        for (int i = 1; i < a.length; i+=2) {
                a[i] = 0;
            }
        System.out.println(Arrays.toString(a));
    }
}
