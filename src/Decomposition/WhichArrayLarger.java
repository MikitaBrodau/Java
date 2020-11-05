package Decomposition;

import static Decomposition.NumberInArray.transformInArray;

public class WhichArrayLarger {
    public static int[] largestArray(int a, int b) {
        int[] arrA = transformInArray(a);
        int[] arrB = transformInArray(b);
        if (arrA.length > arrB.length) return arrA;
        else return arrB;
    }
}
