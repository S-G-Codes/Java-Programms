import java.util.HashSet;
import java.util.Set;

public class NQuuensII {
    // https://leetcode.com/problems/n-queens-ii/submissions/
   
    //Note that (Row + Col values) across 45 degree Daigonal is same
    //Note that (Row - Col values) across 135 degree Daigonal is same

     
    private Set<Integer> usedColIndex = new HashSet<Integer>();
    private Set<Integer> used135DegreeDiagonal = new HashSet<Integer>();
    private Set<Integer> used45DegreeDiagonal = new HashSet<Integer>();
    int count = 0;
    public int totalNQueens(int n) {

      backTracking(n , 0);
      return count;


    }
    private void backTracking(int n, int row) {

        if(row == n){
            count++;
            return;
        }else{
            for (int col = 0; col < n; col++) {
                  if(isSafe(row, col)){
                      usedColIndex.add(col);
                      used135DegreeDiagonal.add(col+row);
                      used45DegreeDiagonal.add(row-col);

                      backTracking(n, row+1);
                      
                      //Classic Bracktracking thing
                      usedColIndex.remove(col);
                      used135DegreeDiagonal.remove(col+row);
                      used45DegreeDiagonal.remove(row - col);
                  }
            }
        }
    }
    private boolean isSafe(int row, int col) {
        if(usedColIndex.contains(col) || used135DegreeDiagonal.contains(col+row)  || used45DegreeDiagonal.contains(row-col)){
            return false;

        }else{

            return true;
        }
    }
    public static void main(String[] args) {
        
    }
}
