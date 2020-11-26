package Decomposition;

import java.util.Arrays;

public class NumberInArray {
    public static int[] transformInArray(int n) {
        String temp = Integer.toString(n);
        int[] arr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            arr[i] = temp.charAt(i) - '0';
        }
        return arr;
    }
}
