package Decomposition;

import java.util.ArrayList;
import java.util.List;

import static Decomposition.NumberInArray.transformInArray;

public class ArmstrongNumber {
    public static List<Integer> Armstrong(int limit) {
        List<Integer> listOfArmstrong = new ArrayList<>();
        for (int i = 1; i < limit; i++) {
            if (sumOfNumArmstrong(transformInArray(i)) == i) {
                listOfArmstrong.add(i);
            }
        }
        return listOfArmstrong;
    }

    public static int sumOfNumArmstrong(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += Math.pow(j, arr.length);
        }
        return sum;
    }
}