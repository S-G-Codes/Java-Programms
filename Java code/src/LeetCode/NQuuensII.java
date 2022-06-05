import java.util.HashSet;
import java.util.Set;

public class NQuuensII {
    // https://leetcode.com/problems/n-queens-ii/submissions/

     
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
                  }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
