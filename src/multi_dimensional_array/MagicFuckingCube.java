package multi_dimensional_array;

public class MagicFuckingCube {
    public int[][] MagicFUCKINGCube(int n){
        int[][] cube = new int[n][n];
        soutArr(cube);
        int row = n-1;
        int col = n/2;
        cube[row][col] = 1;
        for (int i = 2; i <= n*n; i++) {
            if (cube[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            }
            else {
                row = (row - 1 + n) % n;
            }
            cube[row][col] = i;
        }
        soutArr(cube);
        return cube;
    }
    private void soutArr(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }}
