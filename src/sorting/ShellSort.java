package sorting;

import java.util.Arrays;

public class ShellSort {
    public static void Sort(int[] a) {
        System.out.println(Arrays.toString(a));
        int n = a.length;
        for (int gap = n / 2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i++)
            {
                int temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap] > temp; j -= gap)
                {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
