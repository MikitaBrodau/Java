package Decomposition;

import java.util.ArrayList;
import java.util.List;

import static Decomposition.NumberInArray.transformInArray;

public class AscendingOrder {
    public static List<Integer> ascending(int amount) {
        List<Integer> ascOrder = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            int[] c = transformInArray(i);
            if (checkAscension(c)) {
                ascOrder.add(i);
                System.out.println("Number that have ascending order = " + i);
            }
        }
        return ascOrder;
    }

    public static boolean checkAscension(int[] a) {
        boolean flag = false;
        for (int i = 0; i < a.length - 1; i++) {
            flag = a[i] < a[i + 1];
            if (!flag) return flag;
        }
        return flag;
    }
}
