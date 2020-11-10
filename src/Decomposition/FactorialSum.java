package Decomposition;

public class FactorialSum {
    public static int factorialSum() {
        int sum = 0;
        for(int i = 1; i <= 9; i+=2)
        {
            sum += factorial(i);
        }
        return sum;
    }
    public static int factorial(int a){
            int factorial = 1;
            for (int j = 1; j <= a; j++)
            {
                factorial *=  j;
            }
            return factorial;
    }
}
