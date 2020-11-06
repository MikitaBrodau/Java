package multi_dimensional_array;

public class MagicCube {
    public int[][] MagicCube(int n) {
        if (n % 2 != 0) {
            return unEvenCube(n);
        } else return  (evenCube(n));
    }

    public static void soutArr(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }

    public static int[][] unEvenCube(int n) {
        int[][] cube = new int[n][n];
        soutArr(cube);
        int row = n - 1;
        int col = n / 2;
        cube[row][col] = 1;
        for (int i = 2; i <= n * n; i++) {
            if (cube[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            } else {
                row = (row - 1 + n) % n;
            }
            cube[row][col] = i;
        }
        soutArr(cube);
        return cube;
    }

    public static int[][] evenCube(int n) {
        int[][] arr = new int[n][n];
        int i, j;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                arr[i][j] = (n * i) + j + 1;
        for (i = 0; i < n / 4; i++)
            for (j = 0; j < n / 4; j++)
                arr[i][j] = (n * n + 1) - arr[i][j];
        for (i = 0; i < n / 4; i++)
            for (j = 3 * (n / 4); j < n; j++)
                arr[i][j] = (n * n + 1) - arr[i][j];
        for (i = 3 * n / 4; i < n; i++)
            for (j = 0; j < n / 4; j++)
                arr[i][j] = (n * n + 1) - arr[i][j];
        for (i = 3 * n / 4; i < n; i++)
            for (j = 3 * n / 4; j < n; j++)
                arr[i][j] = (n * n + 1) - arr[i][j];
        for (i = n / 4; i < 3 * n / 4; i++)
            for (j = n / 4; j < 3 * n / 4; j++)
                arr[i][j] = (n * n + 1) - arr[i][j];
        soutArr(arr);
        return arr;
    }
}