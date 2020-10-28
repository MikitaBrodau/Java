package one_dimensional_array;

import java.util.Arrays;

public class ReplaceHigherValue {
    int []a = {5,1326,432,7,12,4,3,67,31,5,2332,3,7,23,21,7,3,2,7,2354};
    public void ReplaceHigherValue(int z) {
        System.out.println(Arrays.toString(a));
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > z){
                a[i] = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(count + " - amount of replaces");
    }
}
