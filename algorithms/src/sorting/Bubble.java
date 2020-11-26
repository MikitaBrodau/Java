package sorting;


import java.util.Arrays;

public class Bubble {
    public static void bubbleSort(int arr[]){
    int i, j, temp;
    int n = arr.length;
    boolean swapped;
        System.out.println(Arrays.toString(arr));
    for (i = 0; i < n - 1; i++)
    {
        swapped = false;
        for (j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (swapped == false)
            break;
    }
        System.out.println(Arrays.toString(arr));
}
}
