import java.util.HashSet;


public class check_Does_All_numbers_contain_in_2D_Array {



 static   public boolean checkValid(int[][] matrix) {
       
        int length = matrix.length;
         
     for(int i = 0; i < length; i++){
       HashSet<Integer> row = new HashSet<>();
       HashSet<Integer> col = new HashSet<>();
       
       for (int j = 0; j < length; j++) {
        if(row.contains(matrix[i][j]) || col.contains(matrix[j][i]))   return false;

        row.add(matrix[i][j]);
        col.add(matrix[j][i]);

       }
     }
   
     return true;   
    }








    public static void main(String[] args) {
    
      
  int  matrix[][] = {
           { 1,2,3},
           { 3,1,2},
           { 2,3,1}
        };
       
      System.out.println(checkValid(matrix));  
  

    
    }
}
