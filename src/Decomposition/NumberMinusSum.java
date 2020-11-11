package Decomposition;

import static Decomposition.NumberInArray.transformInArray;
import static Decomposition.UnevenNumbers.sum;

public class NumberMinusSum {
    public static int amountOfOperations(int n) {
        int[] a = transformInArray(n);
        int d = sum(a);
        int count = 0;
        for (int i = n; i > 0; i = i - d) {
            count++;
        }
        System.out.println("Your number = " + n + "\nSum of his numbers in it = " + d + "\nAmount of operations = " + count);
        return count;
    }
}
