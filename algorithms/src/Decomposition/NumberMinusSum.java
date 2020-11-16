package Decomposition;

import static Decomposition.NumberInArray.transformInArray;
import static Decomposition.UnevenNumbers.sum;

public class NumberMinusSum {
    public static int amountOfOperations(int n) {
        int d = sum(transformInArray(n));
        int count = result(n,d);
        System.out.println("Your number = " + n + "\nSum of his numbers in it = " + d + "\nAmount of operations = " + count);
        return count;
    }
    private static int result(int n, int d){
        int counter = 0;
        while (n >= 0){
            n = n-d;
            counter++;
        }
        return counter;
    }
}
