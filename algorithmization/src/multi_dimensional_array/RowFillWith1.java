package multi_dimensional_array;

public class RowFillWith1 {
    public int[][] RowFillWith1(int m, int n){
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(j>=i){ arr[i][j] = 1;}
            }
        }
        SoutArr(arr);
        return arr;
    }
    private void SoutArr(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
