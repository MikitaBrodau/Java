package Decomposition;

import static Decomposition.GCDAndLCM.gcd;

public class GCD4Num {
    public static int gcdOfFour(int[] a) {
        int result = a[0];
        for (int k : a) {
            result = gcd(result, k);
            if (result == 1) {
                return 1; }
        }
        return result;
    }
}