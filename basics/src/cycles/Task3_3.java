package cycles;

import java.util.Scanner;

public class Task3_3 {
    public long Task3_3(){
        long a = 100;
        long sum = 0;
        for (long i = 1; i <= a; i++) {
            sum += Math.pow(i,2);
        }
       return sum;
    }
}
