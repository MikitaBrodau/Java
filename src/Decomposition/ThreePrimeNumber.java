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
        for (int j : a) {
            if (isPrime(j)) {
                System.out.println(j + " Is prime number.");
            } else break;
        }
        return (gcdOfThree(a) == 1);
    }

    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int gcdOfThree(int[] a) {
        int gcd = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                gcd = gcd(a[i], a[j]);
            }
        }
        return gcd;
    }
}
