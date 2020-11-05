package Decomposition;

import java.util.Arrays;

public class PenultMaxNumber {
    public static void PenultMaxNumber(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
    }
}
