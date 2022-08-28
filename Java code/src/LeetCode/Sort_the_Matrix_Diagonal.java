import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Sort_the_Matrix_Diagonal {

    // https://leetcode.com/problems/sort-the-matrix-diagonally/

      // TC : O(m*n * log(D)) , D stand min(m, n)
    // SC: O(m*n)
    public int[][] diagonalSort(int[][] mat) {
        int row = mat.length;   
        int col = mat[0].length;
        
        Map<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
                  int diagonalKey = i-j;
                  PriorityQueue<Integer> pq = map.getOrDefault(diagonalKey, new PriorityQueue<>());
                  pq.offer(mat[i][j]);
                  map.put(diagonalKey, pq);
             }
        }
        for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
                  int diagonalKey = i-j;
                  PriorityQueue<Integer> pq = map.get(diagonalKey);
                   mat[i][j] = pq.poll();
             }
        }

        return mat;
    }
    
    public static void main(String[] args) {
        
    }
}
