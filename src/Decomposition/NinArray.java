package Decomposition;

import java.util.Arrays;

public class NinArray {
    public static int[] NinArray(int n){
        String temp = Integer.toString(n);
        int[] arr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            arr[i] = temp.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
