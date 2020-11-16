package Decomposition;

import static Decomposition.NumberInArray.transformInArray;

public class UnevenNumbers {
    private int sum = 0;
    private int counter = 0;

    @Override
    public String toString() {
        return "UnevenNumbers " + "sum = " + sum + ", amount of even numbers = " + counter;
    }

    public UnevenNumbers(int sum, int counter) {
        this.sum = sum;
        this.counter = counter;
    }

    public static UnevenNumbers unevenNumbers(int amount) {
        int sum = 0;
        for (int i = 1; i <= amount; i++) {
            int[] j = transformInArray(i);
            if (unevenCheck(j)) {
                sum += i;
            }
        }
        return new UnevenNumbers(sum, evenCheck(transformInArray(sum)));
    }

    public static int evenCheck(int[] a) {
        int count = 0;
        for (int j : a) {
            if (j % 2 == 0 && j != 0) count++;
        }
        return count;
    }

    public static boolean unevenCheck(int[] a) {
        for (int j : a) {
            if (j % 2 == 0) return false;
        }
        return true;
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        return sum;
    }
}
