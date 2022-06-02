public class Transpose_of_Matrix {
    // https://leetcode.com/problems/transpose-matrix/
 static   public int[][] transpose(int[][] matrix) {
          
        int row = matrix.length;
        int col = matrix[0].length;
      int ans[][] = new int[row][col];

      for (int r = 0; r < row; r++) {
          for (int c = 0; c < col; c++) {
               ans[c][r] = matrix[r][c];
          }
      }
        return ans;
    }

    public static void main(String[] args) {
            int matrix[][] =  {  {1,2,3},
                                 {4,5,6},
                                 {7,8,9}
                            };

                            System.out.println(transpose(matrix));
                           
    }
}
