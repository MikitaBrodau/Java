package Decomposition;

public class FactorialSum {
    public static int factorialSum() {
        int sum = 1;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) continue;
            sum *= i;
        }
        return sum;
    }
}
