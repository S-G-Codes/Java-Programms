public class SearchInTWODArray {

    //same code both search in 2d matrix I and II 
//url  https://leetcode.com/problems/search-a-2d-matrix-ii/

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
      int col = matrix[0].length -1;
//         Note for me - Look at the Notes or Approach in Green Football Astronaut NoteBook
      //Same code as search in a 2d matrix I
      while(row < matrix.length && col >=0){
          if(matrix[row][col] == target) return true;
          
          if(matrix[row][col] < target){
              row++;
          }else{
              col--;
          }
      }
      return false;
  }
    public static void main(String[] args) {
        
    }
}
