package sorting;


import java.util.Arrays;

public class QuickSort {
    public static int[] startSorting(int[] arr){
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    private static void sort(int[] arr, int begin, int end){
        if (begin < end){
            int pI = partition(arr, begin, end);
            sort(arr,begin, pI-1);
            sort(arr, pI+1, end);
        }
    }
    private static int partition(int[] arr, int begin, int end){
        int pivot = arr[end];
        int i =(begin -1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot){
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        return i+1;
    }
}