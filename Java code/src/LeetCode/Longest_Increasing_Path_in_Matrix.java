public class Longest_Increasing_Path_in_Matrix {

    // https://leetcode.com/problems/longest-increasing-path-in-a-matrix/

        //Tc = O(n*m) , and space as well

    private int[][] directions = { {1,0} , {0,1} , {-1,0} , {0,-1}  };

    public int longestIncreasingPath(int[][] matrix) {
         
        if(matrix == null) return 0;
        
       int m = matrix.length;
        int n = matrix[0].length;
        
        if(m ==0 || n ==0) return 0;
        
             
         int cache[][] = new int[m][n];
         
         //default we are starting from 1
         int maxLength =1;


         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                   
                int currentMaxlength =  dfs(i , j , matrix , m , n , cache);
                 maxLength = Math.max( maxLength , currentMaxlength);
             }
         }
         return maxLength;


        
    }
    private int dfs(int i, int j, int[][] matrix, int m, int n, int[][] cache) {
         
        if(cache[i][j] !=0 ) return cache[i][j];

        int currentLength =1;

        for(int [] direction :  directions){
            int neighX = i + direction[0];
            int neighY = j + direction[1];


            if(neighX < 0 || neighY < 0  || neighX >= m || neighY >= n) continue;

         if(   matrix[i][j]  >= matrix[neighX][neighY]) continue;

         currentLength = Math.max(currentLength,  1 + dfs(neighX, neighY, matrix, m, n, cache));
       
        } 

        cache[i][j] = currentLength;
        return currentLength;


    }
    public static void main(String[] args) {
        
    }
}
