package Decomposition;

import static Decomposition.NinArray.transform;

public class WhichArrayLarger {
    public static int[] largestArray(int a, int b){
        int[] arrA = transform(a);
        int[] arrB = transform(b);
        if (arrA.length > arrB.length) return arrB;
        else return arrB;
    }
}
