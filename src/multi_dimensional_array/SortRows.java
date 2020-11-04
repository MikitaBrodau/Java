package multi_dimensional_array;

import java.util.Arrays;
import java.util.Collections;

public class SortRows {
    public void SortRows(int n) {
        int[][] arr = new int[n][n];
        RandomMatrix(arr);
        Sort(arr);
        System.out.println();
        SoutArr(arr);
        System.out.println();
        Replace(arr);
        SoutArr(arr);
    }


    private int[][] RandomMatrix(int[][] matrix) {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = (int) (Math.random() * 16);
            }
        }
        return matrix;
    }

    private void SoutArr(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private int[][] Sort(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            Arrays.sort(arr[i]);
        }
        return arr;
    }

    public int[][] Replace(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                if (matrix[i][j] < matrix[i][matrix[i].length - 1 - j]) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix[i].length - j - 1];
                    matrix[i][matrix[i].length - j - 1] = temp;
                }
            }
        }
            return matrix;
    }
}