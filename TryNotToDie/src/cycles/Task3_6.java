package cycles;

import java.util.Scanner;

public class Task3_6 {
    public void Task3_6() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("n = " + n);
        int m = sc.nextInt();
        System.out.println("m = " + m);
        int minimum = Math.min(m, n);
        int maximum = Math.max(m, n);
        for (int i = minimum; i < maximum; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i){
                    continue;
                }
                if (minimum % j == 0) {
                    System.out.print(minimum + ": \t" + j + " \n");
                }
            }
        }
    }
}