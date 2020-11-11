package Decomposition;

import java.util.Arrays;

import static Decomposition.NumberInArray.transformInArray;

public class SumOfKAndLowerThenN {
    public static int[] summary(int k, int m) {
        int[] a = transformInArray(k);
        int sum = 0;
        for (int j : a) {
            sum += j;
            if (sum > m) {
                System.out.println("Sum of elements higher then  M number. sum is = " + sum);
                break;
            }
        }
        System.out.println("Sum of numbers in K = " + sum + "\nNumbers in K" + Arrays.toString(a) + "\nM was = " + m);
        return a;
    }
}