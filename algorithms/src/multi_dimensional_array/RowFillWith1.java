package multi_dimensional_array;

public class RowFillWith1 {
    public int[][] RowFillWith1(int m, int n){
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            columnsFill(arr,i);
        }
        for (int i = 0; i < arr.length; i++) {
            shuffle(arr,i);
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
    private int[][] columnsFill(int[][] matrix,int column){
        for (int i = 0; i <= column; i++) {
            matrix[i][column]= 1;
        }
        return  matrix;
    }
    private void shuffle(int[][]arr, int column){
        for (int i = arr.length - 1; i >= 1; i--)
        {
            int j = (int) (Math.random()*arr.length);
            int tmp = arr[j][column];
            arr[j][column] = arr[i][column];
            arr[i][column] = tmp;
        }
    }
    }