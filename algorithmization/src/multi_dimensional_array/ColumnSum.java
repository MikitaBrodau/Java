package multi_dimensional_array;


public class ColumnSum {
    public int[][] ColumnSum(int n) {
        int[][] arr = new int[n][n];
        RandomMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = Sum(i,arr);
            System.out.println("Sum of " + i + " column = " + sum);
        }
        return arr;
    }

    private int[][] RandomMatrix(int[][] matrix) {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = (int) (Math.random() * 11);
            }
        }
        return matrix;
    }
    private int Sum(int col,int[][] a){
        int sum = 0;
        for (int[] ints : a) {
            sum += ints[col];
        }
        return sum;
    }
}