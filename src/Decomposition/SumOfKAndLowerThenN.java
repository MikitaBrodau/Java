package Decomposition;

import java.util.Arrays;

public class SumOfKAndLowerThenN {
    public static int[] Summary (int k, int m){
        int[] a = transform(k);
        int sum = 0;
        for (int j : a) {
            sum += j;
            if (sum > m) {
                System.out.println("Sum of elements higher then  M number. sum is = " + sum);
                break;
            }
        }
        System.out.println("Sum of numbers in K = " + sum + "\nNumbers in K" + Arrays.toString(a) + "\nM was = " + m);
        return  a;
    }
    private static int[] transform ( int a){
        String temp = Integer.toString(a);
        int[] arr = new int [temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            arr[i] = temp.charAt(i) - '0';
        }
        return arr;
    }
}