package multi_dimensional_array;

public class DiagonalInverse {
    public int[][] DiagonalInverse(int n){
        int[][] array = new int[n][n];
        Fill(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }
    private int[][] Fill(int[][] array){
        int x = array.length;
        for (int i = 0; i < x; i++) {
            int y = array[i].length;
            for (int j = 0; j < y; j++) {
                if (x-j-1 >= i) array[i][j] = i+1;

            }
        }
        return array;
    }
}
