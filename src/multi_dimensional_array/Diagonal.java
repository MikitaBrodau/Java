package multi_dimensional_array;

public class Diagonal {
    public int[][] Diagonal(int n){
        int[][] array = new int[n][n];
        RandomMatrix(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        DiagonalOutput(array);
        return array;
    }
    public int[][] RandomMatrix(int[][] matrix){
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = (int) (Math.random()*11);
            }
        }
        return matrix;
    }
    public int[][] DiagonalOutput(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == matrix[j][i]) System.out.print("\n"+ matrix[j][i]);
            }
        }
        return matrix;
    }
}
