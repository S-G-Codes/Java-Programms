public class UniquePaths {
    // https://leetcode.com/problems/unique-paths/
//   static  public int uniquePaths(int m, int n) {
//         //brute force using recursion

//           return travseing(m , n , 0 , 0);
      
//     }


//     public static int travseing(int m , int  n , int i , int j) {
//           if( i >= m || j >=n) return 0;
//           if(i == m-1 || j == n-1) return 1;

//           int a = travseing(m, n, i+1, j);
//           int b = travseing(m, n, i, j+1);
//         return a+b;
//     }



//using dp
  static  public int uniquePaths(int m, int n) {
        int dp [][] = new int [m][n];
       
        //filling 1 st row with 1 bcz there is only 1 way to go through it to reach the target
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        //filling 1 st col with 1 bcz there is only 1 way to go through it to reach the target
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
   

        //finding other ways from  matrix(1,1) to reach the target
         
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];

            }
        }
        return dp[m-1][n-1];


  }

    public static void main(String[] args) {
          int m = 3;
          int n = 7;

        System.out.println(uniquePaths(m, n));  
    }
}
