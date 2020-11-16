package Decomposition;

import java.util.ArrayList;
import java.util.List;

public class TwinNumbers {
    public static List<Integer> primeTwins(int amount) {
        List<Integer> list = counterOfPrimeNumbers(amount);
        list = twins(list);
        return list;
    }

    private static List<Integer> twins(List<Integer> a) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) + 2 == a.get(i + 1)) {
                list.add(a.get(i));
                list.add(a.get(i + 1));
            }
        }
        return list;
    }

    private static List<Integer> counterOfPrimeNumbers(int amount) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < amount; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }


}

