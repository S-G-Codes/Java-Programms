public class SearchInTWODArray {

    //same code both search in 2d matrix I and II 
//url  https://leetcode.com/problems/search-a-2d-matrix-ii/

public boolean searchMatrix(int[][] matrix, int target) {
 
    //This is Binary Search Question
   //Approch  will be simple   //Tc O(n)(for row O(n) and for col O(n) s0 O(n) + O(n) = 2 O(n) Hence 2 is constant so ignored so TC O(n) and space O(1) )
    
    //All Possible cases will be
    
    //Traverse through first row till row th last element and so on 
    
    // case 1 :  if curr.element == target  return elememt or Found ans
    
    //case 2 : if current.element  < target    means as we know row is sorted in asecending and col as well  this cond means our target is greater then this row which we were traversing so we can simply discard this row and try to search in another row  i.e row++ 
    
    //case 3 : if curr.element > target   this means our rowth last element or col last first element there we are currently so as we col are also sorted in asecending order so this cond means our target is  lesser then this col so we can discard this col as well i.e col--
    
    //and so on till we get our target  
    
    int row = 0; //staring from first element
     int col =  matrix[0].length -1;   //first row last elment 
    
 
    
    while( row <  matrix.length && col >=0){
        
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
