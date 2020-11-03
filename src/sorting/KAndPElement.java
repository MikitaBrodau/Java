package sorting;

import java.util.Arrays;

public class KAndPElement {
    public int[]  CopyArray(int k){
        int [] aDest = {5,1,73,43,2,77,82,21,43,6,7,32,5,6,83,45,2};
        int [] bSource = {4,526,13,724,8245,3,21,5,634};
        System.out.println(Arrays.toString(aDest));
        aDest = resizeArr(aDest,bSource,k);
        System.out.println(Arrays.toString(aDest));
        return aDest;
    }
    public int[] resizeArr(int[] a, int[] b, int k){
        int[] d = new int [a.length + b.length];
        System.arraycopy(a, 0, d, 0, a.length);
        System.arraycopy(b, 0, d, k, b.length);
        System.arraycopy(a, k, d, b.length+k, a.length-k);

        return d;
    }
}
