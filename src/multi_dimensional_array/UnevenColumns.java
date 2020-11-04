package multi_dimensional_array;

public class UnevenColumns {
    public int[][] UnevenColumns(int n) {
        int[][] matrix = new int[n][n];
        RandomMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + "\t");
            }
            System.out.println();
        }
        DelUneven(matrix);
        return matrix;
    }
    private int[][] DelUneven(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length-1][j])
                    if (matrix[0][j] > matrix[matrix.length-1][j])
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        return matrix;
    }
    public int[][] RandomMatrix(int[][] matrix){
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = (int) (Math.random()*11);
            }
        }
        return matrix;
    }
}