package Decomposition;

public class ArmstrongNumber {
    public static void Armstrong (int amount){
        for (int i = 0; i < amount; i++) {
            if(sum(i) == i){
                System.out.println(i + "is Armstrong Number");
            }
        }
    }

    private static int sum ( int a){
        String temp = Integer.toString(a);
        int[] arr = new int [temp.length()];
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = temp.charAt(i) - '0';
            sum += Math.pow(arr[i], temp.length());
        }
        return sum;
    }
}
