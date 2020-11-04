package Decomposition;

import java.util.Arrays;

import static Decomposition.NinArray.transform;

public class SumOfKAndLowerThenN {
    public static int[] summary (int k, int m){
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
}