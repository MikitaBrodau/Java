package Decomposition;

public class GCDAndLCM {
    public static void gcdAndLcm(int a, int b) {
        System.out.println("НОД= " + gcd(a, b) + "\nНОК= " + lcm(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
