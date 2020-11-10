package multi_dimensional_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortRows {
    public void SortRows(int n) {
        int[][] arr = new int[n][n];
        RandomMatrix(arr);
        Sort(arr);
        System.out.println();
        SoutArr(arr);
        System.out.println();
        SortDesc(arr);
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

    private void Sort(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            Arrays.sort(arr[i]);
        }
    }

    private static void SortDesc(int[][] arr) {
        int m;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (m = j; m < arr[i].length; m++) { //error
                    if (arr[i][j] < arr[i][m]) {
                        temp = arr[i][j];
                        arr[i][j] = arr[i][m];
                        arr[i][m] = temp;
                    }
                }
            }
        }
    }
}