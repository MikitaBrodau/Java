package Decomposition;

public class NumberMinusSum {
    public static int amountOfOperations (int n){
        int[] a = transform(n);
        int d = sum(a);
        int count = 0;
        for (int i = n; i > 0; i= i - d) {
            count++;
        }
        System.out.println("Your number = " + n + "\nSum of his numbers in it = " + d +"\nAmount of operations = "+count);
        return count;
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
