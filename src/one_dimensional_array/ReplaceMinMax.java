package one_dimensional_array;

public class ReplaceMinMax {
    public int[] ReplaceMinMax(int[] a){
        int min = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[max] < a[i]) max = i;
            if (a[min] > a[i]) min = i;
        }
        System.out.println(a[min] + " " + a[max]);
        Exchange(a,min,max);
            return a;
    }
    public void Exchange(int[]a,int min, int max){
        int temp = a[min];
        a[min] = a[max];
        a[max] = temp;
    }
}

