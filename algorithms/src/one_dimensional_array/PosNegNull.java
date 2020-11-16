package one_dimensional_array;

public class PosNegNull {
    int []a = {4,67,2,6,2,5,6779,4898,1236,345,0,0,1,5,15,0,-636776,-23,561,4521,63,123,-3};
    public void PosNegNull(){
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0){
                countPositive++;
            }
            if (a[i] < 0){
                countNegative++;
            }
            if (a[i] == 0){
                countZero++;
            }
        }
        System.out.println("Positive values = " + countPositive + "\n" + "Negative values = " + countNegative
                + "\n" + "Zero values = " + countZero);
    }
}
