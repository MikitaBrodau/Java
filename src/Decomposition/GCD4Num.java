package Decomposition;

public class GCD4Num {
    public static void GCD4Num(int[] a){
        System.out.println(gcd(a));
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private static int gcd(int[] a) {
        int result = a[0];
        for (int k : a) {
            result = gcd(result, k);
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }
}