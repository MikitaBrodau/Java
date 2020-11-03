package Decomposition;

public class WhichArrayLarger {
    public static int[] LargestArray(int a, int b){
        int[] arrA = transform(a);
        int[] arrB = transform(b);
        if (arrA.length > arrB.length) return arrB;
        else return arrB;
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
