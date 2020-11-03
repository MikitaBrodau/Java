package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static int[] Sort(int [] arr){
        System.out.println(Arrays.toString(arr));
        for (int left = 0; left < arr.length; left++) {
            int right = left;
            for (int i = left; i < arr.length; i++) {
                if (arr[i] < arr[right]){
                    right = i;
                }
            }
            swap(arr,left,right);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
