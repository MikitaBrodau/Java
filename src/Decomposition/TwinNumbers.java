package Decomposition;

public class TwinNumbers {
    public static int primeTwins(int amount) {
        int counter = counterOfPrimeNumbers(amount);
        System.out.println("Amount of prime number twins = " + counter);
        return counter;
    }

    private static int counterOfPrimeNumbers(int amount) {
        int counter = 0;
        for (int i = 1; i < amount - 1; i++) {
            if (isPrime(i - 1) & isPrime(i + 1)) {
                System.out.println((i - 1) + " And " + (i + 1) + " Is Prime Numbers");
                counter++;
            }
        }
        return counter;
    }
    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}

