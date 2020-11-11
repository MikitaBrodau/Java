package multi_dimensional_array;

public class FixSizedMatrix {
    public int[][] FixedSizedMatrix() {
        int[][] arr = new int[10][20];
        RandomMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            if(NumberInRow(arr,i)) System.out.println(i);
        }
        SoutArr(arr);
        return arr;
    }
    private int[][] RandomMatrix(int[][] matrix) {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = (int) (Math.random() * 16);
            }
        }
        return matrix;
    }
    private void SoutArr(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private boolean NumberInRow(int[][] arr, int row ){
        int count = 0;
        for (int j = 0; j < arr[row].length; j++) {
            if (arr[row][j] == 5) {
                ++count;
                if(count >= 3) return true;
            }
        }
        return false;
    }
}