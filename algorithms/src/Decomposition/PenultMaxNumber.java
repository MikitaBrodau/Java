package Decomposition;

import java.util.Arrays;

public class PenultMaxNumber {
    public static int PenultMaxNumber(int[] arr) {
        int max = arr[0];
        int preMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                preMax = max;
                max = arr[i];
            }
        }
        return preMax;
    }
}
