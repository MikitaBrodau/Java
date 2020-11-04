package Decomposition;

import java.util.Scanner;

public class ThreePrimeNumber {
    public static void ThreePrimeNumber(){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        System.out.println("Type your three numbers.");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int j : a) {
            if (isPrime(j)) {
                System.out.println(j + " Is prime number.");
            }
        }
    }
    public static boolean isPrime (int a){
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
