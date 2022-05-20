public class UniquePathsII {
    // https://leetcode.com/problems/unique-paths-ii/
           //Approch - To reach a certain point calculate the previous ways to reaching it and add them
          //same approch as unique path only while traversing if we get an obstacle just add 0 over there

    public int uniquePathsWithObstacles(int[][] matrix) {
        int m  = matrix.length;
               int n = matrix[0].length;
        int[][] dp = new int[m][n];


        for ( int i = 0; i < m; i++) {
              if(matrix[0][i] == 1) break;

              dp[0][i] = 1;
        }
        for ( int i = 0; i < n; i++) {
              if(matrix[i][0] == 1) break;

              dp[i][0] = 1;
        }


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(matrix[i][j] ==1){

                    dp[i][j] = 0;
                }else{
                    dp[i][j]  = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        return dp[m-1][n-1];



    }
    public static void main(String[] args) {
        
    }
}
