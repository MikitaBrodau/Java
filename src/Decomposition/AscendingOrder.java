package Decomposition;

import java.util.ArrayList;
import java.util.List;

public class AscendingOrder {
    public static List ascending (int amount){
        List<Integer> ascOrder = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            int[] c = transform(i);
            if (check(c)){
                ascOrder.add(i);
                System.out.println("Number that have ascending order = " + i);
            }
        }
        return ascOrder;
    }

    private static boolean check(int[] a){
        boolean flag = false;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i] < a[i+1]) flag = true;
            else flag = false;
            if (!flag) return flag;
        }
        return flag;
    }

    private static int[] transform ( int a){
        String temp = Integer.toString(a);
        int[] arr = new int [temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            arr[i] = temp.charAt(i) - '0';
        }
        return arr;
    }
}
