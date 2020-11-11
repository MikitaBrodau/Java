package one_dimensional_array;

public class Aliquot {
    int [] a = {6,3,6,135,2,67,1234,7,12,72,3,7};
    public void Aliquot(int b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % b == 0) {
                System.out.println(a[i] + " aliquot = " + b);
                sum = a[i] + sum;
            }
        }
        System.out.println("sum = " + sum);
    }
}
