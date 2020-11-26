package Decomposition;

import static Decomposition.GCDAndLCM.gcd;

import java.util.Scanner;

public class ThreePrimeNumber {
    public static boolean threePrimeNumbersCheck() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        System.out.println("Type your three numbers.");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return (gcdOfThree(a) == 1);
    }
    public static int gcdOfThree(int[] a) {
        return GCD4Num.gcdOfFour(a);
    }
}
