package cycles;

import java.util.Scanner;

public class Task3_1 {
    public int Task3_1(){
        Scanner sc = new Scanner(System.in);
        do{
            while (!sc.hasNextInt()){
                sc.next();
                System.out.println("Positive number value required");
            }
        }while(!sc.hasNextInt());
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
