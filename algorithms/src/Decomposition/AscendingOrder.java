package Decomposition;

import java.util.*;

import static Decomposition.NumberInArray.transformInArray;

public class AscendingOrder {
    public static List<Integer> ascending(int amount) {
        List<Integer> ascOrder = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            int[] c = transformInArray(i);
            if (checkAscension(c)) {
                ascOrder.add(i);
            }
        }
        return ascOrder;
    }

    public static boolean checkAscension(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i + 1]) return false;
        }
        return true;
    }
}
