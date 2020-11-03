package Decomposition;

public class UnevenNumbers {
    public static void UnevenNumbers(int amount){
        for (int i = 0; i < amount; i++) {
            int[] numbers = transform(i);
            int sumOfNumbers = sum(numbers);
            int[] summary = transform(sumOfNumbers);
            if (unevenCheck(numbers)){
                int count = evenCheck(summary);
                System.out.println("Number = " + i + " Even numbers in sum = " + count);
            }
            }
        }
        
    private static int evenCheck(int[] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 ) count++;
        }
        return count;
    }
    private static boolean unevenCheck(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) return false;
        }
     return true;
    }
    private static int sum (int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    private static int[] transform ( int a){
        String temp = Integer.toString(a);
        int[] arr = new int [temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            arr[i] = temp.charAt(i) - '0';
        }
        return arr;
    }
}
