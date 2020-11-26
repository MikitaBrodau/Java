package one_dimensional_array;

public class PrimeNumbers {
    public int RealNumbers(int [] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(i)){
              sum+= a[i];
            }
        }
        return sum;
    }
        private static boolean isPrime (int a){
            for (int i = 2; i < a; i++) {
                if (a % i == 0) return false;
            }
            return true;
        }
    }
