package one_dimensional_array;

import java.util.*;

public class MostSequenceNumber {
    public int MostSequenceNumber(int[] array) {
        Map<Integer, Integer> freqs = new HashMap<>();
        for (int j : array) {
            Integer freq = freqs.get(j);
            freqs.put(j, freq == null ? 1 : freq + 1); // copy array into map
        }
        int maxFrequency = 0;
        for (Map.Entry<Integer,Integer> count: freqs.entrySet()) {
                maxFrequency = Math.max(maxFrequency, count.getValue()); // second loop for detection most entries of number
        }
        int minNumber = array[0];
        for (Map.Entry<Integer, Integer> entry: freqs.entrySet()) {
            if(entry.getValue() == maxFrequency){
                minNumber = Math.min(minNumber, entry.getKey()); // third loop for search the lower number
            }
        }
        System.out.println("The lowest most common number is = " + minNumber + " His frequency is = " + maxFrequency);
        return minNumber;
    }
}