package Decomposition;

import java.util.ArrayList;
import java.util.List;

import static Decomposition.NinArray.transform;

public class AscendingOrder {
    public static List ascending (int amount){
        List<Integer> ascOrder = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            int[] c = transform(i);
            if (checkAscension(c)){
                ascOrder.add(i);
                System.out.println("Number that have ascending order = " + i);
            }
        }
        return ascOrder;
    }

    public static boolean checkAscension(int[] a){
        boolean flag = false;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i] < a[i+1]) flag = true;
            else flag = false;
            if (!flag) return flag;
        }
        return flag;
    }
}
