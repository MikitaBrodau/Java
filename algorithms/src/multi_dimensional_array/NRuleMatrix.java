package multi_dimensional_array;

public class NRuleMatrix {
    public int[][] NRuleMatrix(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) array[i][j] = j + 1;
                else array[i][j] = array[i].length - j;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }
}