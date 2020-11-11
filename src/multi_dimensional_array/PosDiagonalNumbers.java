package multi_dimensional_array;

import java.util.ArrayList;
import java.util.List;

public class PosDiagonalNumbers {
    public int[][] PosDiagonalNumbers(int n){
        int [][] arr = new int[n][n];
        RandomMatrix(arr);
        arr[4][4] = -67;
        List<Integer> posNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] >= 0 && i==j) posNumbers.add(arr[i][j]);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("On Diagonal u have next positive values" + posNumbers.toString());
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
}