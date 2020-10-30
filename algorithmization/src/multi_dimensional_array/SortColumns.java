package multi_dimensional_array;

import java.util.Arrays;

public class SortColumns {
    public void sortColumns(int n) {
        int[][] arr = new int[n][n];
        randomMatrix(arr);
        int[][] arrCopy = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
        arrCopy[i] = Arrays.copyOf(arr[i],arr.length);}
        ascDESC(arrCopy);
        soutArr(arrCopy);
        System.out.println();
        asc(arr);
        soutArr(arr);
    }

    private void randomMatrix(int[][] matrix) {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++)
                matrix[x][y] = (int) (Math.random() * 16);
        }
    }

    private void soutArr(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }

    private void Sort(int[][] arr, int low, int high, int column) {
        if (low < high) {
            int pi = partition(arr, low, high, column);
            Sort(arr, low, pi - 1, column);
            Sort(arr, pi + 1, high, column);
        }
    }

    private int partition(int[][] arr, int low, int high, int column) {
        int pi = arr[high][column];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j][column] >= pi) {
                i++;
                int temp = arr[i][column];
                arr[i][column] = arr[j][column];
                arr[j][column] = temp;
            }
        }
        int temp = arr[i + 1][column];
        arr[i + 1][column] = arr[high][column];
        arr[high][column] = temp;
        return i + 1;
    }

    private int[][] asc(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Sort(arr, 0, n - 1, j);
            }

        }
        return arr;
    }
    private void SortDESC(int[][] arr, int low, int high, int column) {
        if (low < high) {
            int pi = partitionDESC(arr, low, high, column);
            SortDESC(arr, low, pi - 1, column);
            SortDESC(arr, pi + 1, high, column);
        }
    }

    private int partitionDESC(int[][] arr, int low, int high, int column) {
        int pi = arr[high][column];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j][column] <= pi) {
                i++;
                int temp = arr[i][column];
                arr[i][column] = arr[j][column];
                arr[j][column] = temp;
            }
        }
        int temp = arr[i + 1][column];
        arr[i + 1][column] = arr[high][column];
        arr[high][column] = temp;
        return i + 1;
    }

    private int[][] ascDESC(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                SortDESC(arr, 0, n - 1, j);
            }

        }
        return arr;
    }
}