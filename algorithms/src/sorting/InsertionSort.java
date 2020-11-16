package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] a){
        System.out.println(Arrays.toString(a));
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i-1;
            while( j>=0 && a[j] > key){
                a[j+1] = a[j];
                j=j-1;
            }
            a[j+1] = key;
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}
