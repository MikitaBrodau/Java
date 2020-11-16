package multi_dimensional_array;

public class FillingInCenter {
        public int[][] FillingInCenter ( int n){
            int[][] array = new int[n][n];
            Fill(array);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
            return array;
        }
        private int[][] Fill ( int[][] arr){
            int n = arr.length;
            for (int rows = 0; rows < n / 2; rows++) {
                for (int columns = rows; columns < n -rows; columns++) {
                    arr[rows][columns] = 1;
                    arr[n - 1 - rows][columns] = 1;
                }
            }
            return arr;
        }
}