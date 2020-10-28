package one_dimensional_array;

public class LessThan_I {
    public void LessThan_I(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i){
                System.out.print(a[i] + " ");
            }
        }
    }
}
