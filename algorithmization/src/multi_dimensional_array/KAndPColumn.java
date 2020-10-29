package multi_dimensional_array;

public class KAndPColumn {
    public int[][] KAndPColumn(int n,int k, int p){
        int[][] array = new int[n][n];
        RandomMatrix(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\t"+array[i][j]);
            }
            System.out.println();
        }
        System.out.println(array[k][p]);

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
}
