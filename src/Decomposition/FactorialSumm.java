package Decomposition;

public class FactorialSumm {
    public static void FactorialSumm(){
        int sum = 1;
        for (int i = 1; i <= 9; i++) {
            if(i % 2 == 0 ) continue;
            sum *= i;
        }
        System.out.println(sum);
    }
}
