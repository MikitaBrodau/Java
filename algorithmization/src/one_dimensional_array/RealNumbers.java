package one_dimensional_array;

public class RealNumbers {
    public int RealNumbers(int [] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (Check(i)){
              sum+= a[i];
            }
        }
        return sum;
    }
    public boolean Check(int i) {
        return i % 2 == 0;
    }
}
