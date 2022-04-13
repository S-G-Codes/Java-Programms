import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {
    // https://leetcode.com/problems/spiral-matrix/
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<Integer>();
 
         if(matrix.length == 0) return list;

        int  n= matrix.length;
        int m = matrix[0].length;

        int rowStart = 0;

        int rowEnd = n-1;
  
        int colStart = 0;
  
        int colEnd = m-1;

     
          
        while(rowStart <= rowEnd && colStart <= colEnd){
            //right side
            for (int i = colStart; i <= colEnd ; i++) {
                list.add(matrix[rowStart][i]);
            }
            rowStart++;

            //Move down
            for (int i = rowStart; i <= rowEnd; i++) {
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            if(rowStart <= rowEnd){
                //move left
                for (int i = colEnd; i >= colStart; i--) {
                     list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if(colStart <= colEnd){
                //move to top
                for (int i = rowEnd; i  >= rowStart; i--) {
                    list.add(matrix[i][colStart]);
                }
            }
            colStart++;
   

        }
        return list;

       
    }
public static void main(String[] args) {
    
}
}

