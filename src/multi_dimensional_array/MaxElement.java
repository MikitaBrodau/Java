package multi_dimensional_array;

public class MaxElement {
    public int[][] maxElement(int n){
        int[][] arr = new int [n][n];
        randomMatrix(arr);
        int max = maxNumber(arr);
        unevenElementsChange(arr,max);
        soutArr(arr);
        return arr;
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
    private int maxNumber(int[][]arr){
        int max = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) max = arr[i][j];
            }
        }
        return max;
    }
    private int[][] unevenElementsChange(int[][]arr, int max){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 != 0) arr[i][j] = max;
            }
        }
        return arr;
    }
}
