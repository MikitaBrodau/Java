package Decomposition;

import java.util.ArrayList;
import java.util.List;

import static Decomposition.NinArray.transform;

public class ArmstrongNumber {
    public static List<Integer> Armstrong(int amount) {
        List<Integer> listOfArmstrong = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            if (sumOfNumsArmstrong(transform(i)) == i) {
                listOfArmstrong.add(i);
            }
        }
        return listOfArmstrong;
    }

    public static int sumOfNumsArmstrong(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], arr.length);
        }
        return sum;
    }
}