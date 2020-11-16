package multi_dimensional_array;

public class RuleSin {
    public double[][] RuleSin(int n){
        double a[][] = new double[n][n];
        Fill(a,n);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%5.2f \t",a[i][j]);
            }
            System.out.println();
        }
        return a;
    }
    private double[][] Fill(double [][]a,int n){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            a[i][j] = (Math.sin((Math.pow(i,2) - Math.pow(j,2))/n));
            if (a[i][j] > 0) count++;
            }

        }
        System.out.println("Positive numbers: " + count);
        return a;
    }
}
