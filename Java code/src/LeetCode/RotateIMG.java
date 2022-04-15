public class RotateIMG {
    // https://leetcode.com/problems/rotate-image/
    //Approch is simple
    //1. find the transpose of matrix
    //2 . reverese each col 
    //3 . By this we will rotate the img by 90 degreee
    public void rotate(int[][] matrix) {
          //Transpose
          for (int i = 0; i < matrix.length; i++) {
              for (int j = i; j < matrix[0].length; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
          }

    // Reverse reach col
             for (int i = 0; i < matrix.length; i++) {
                  for (int j = 0; j <  matrix.length/2; j++) {
                      int temp = matrix[i][j];
                      matrix[i][j] = matrix[i][matrix.length-j -1];
                      matrix[i][matrix.length-j -1] = temp;
                  }
             }


    }
    public static void main(String[] args) {
        
    }
}
