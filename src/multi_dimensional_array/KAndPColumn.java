package multi_dimensional_array;

public class KAndPColumn {
    public int[][] KAndPColumn(int n,int k, int p){
        int[][] array = new int[n][n];
        RandomMatrix(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        column(array,k);
        row(array,p);

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
    private static void column(int[][] matrix, int k){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("\t"+matrix[i][k]);
        }
    }
    private static void row (int[][] matrix, int p){
        for (int i = 0; i < matrix.length ; i++) {
                System.out.print(matrix[p][i] + " ");
        }
    }
}
