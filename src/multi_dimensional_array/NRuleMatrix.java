package multi_dimensional_array;

public class NRuleMatrix {
    public int[][] NRuleMatrix(int n) {
        if (n % 2 != 0) throw new IllegalArgumentException("Not even."); //check
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j;
            }
        }
//        Replace(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i%2 != 0) System.out.print(array[i][array[i].length-1-j] + "\t");
                else System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }

//    public int[][] Replace(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length / 2; j++) {
//                if(i%2 != 0){
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[i][matrix[i].length - j - 1];
//                matrix[i][matrix[i].length - j - 1] = temp;}
//            }
//        }
//    return matrix;
//    }

}