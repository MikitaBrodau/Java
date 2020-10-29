package multi_dimensional_array;

import java.util.Scanner;

public class ColumnSwap {
    public int [][] ColumnSwap(int n){
        int arr[][] = new int[n][n];
        RandomMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Type columns that you want to swap.");
        int col1 = sc.nextInt();
        int col2 = sc.nextInt();
        Swap(arr, col1,col2);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        return arr;
    }
    private int[][] RandomMatrix(int[][] matrix){
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = (int) (Math.random()*11);
            }
        }
        return matrix;
    }
    private int[][] Swap(int[][] matrix, int col0, int col1) {
        int rows = matrix.length;
        for (int row=0; row<rows; row++)
            swap(matrix, row, col0, row, col1);
        return matrix;
    }
    private void swap(int[][] matrix, int i0, int j0, int i1, int j1) {
        int temp = matrix[i0][j0];
        matrix[i0][j0] = matrix[i1][j1];
        matrix[i1][j1] = temp;
    }
}
