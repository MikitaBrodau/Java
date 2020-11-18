package Decomposition;

import static Decomposition.NumberInArray.transformInArray;
import static Decomposition.UnevenNumbers.sum;

public class NumberMinusSum {
    public static int amountOfOperations(int n) {
        int count = 0;
        int j = n;
        while(j>0){
            int d = sum(transformInArray(j));
            j = j-d;
            count++;
        }
        System.out.println("Your number = " + n + "\nAmount of operations = " + count);
        return count;
    }
}
