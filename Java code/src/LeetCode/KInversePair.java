public class KInversePair {
    // https://leetcode.com/problems/k-inverse-pairs-array/


//Accepted one
    int M = 1000000007;
    public int kInversePairs(int n, int k) {
    
        int [] dp = new int[k+1];
        
        for (int i = 1; i <= n; i++) {
            
            int [] prevRow = new int[k+1];
            prevRow[0] = 1;     // for k = 0, ans = 1
            for (int j = 1; j <= k; j++)  {
                
                int val = (dp[j] + M - ((j-i >= 0) ? dp[j-i] : 0)) % M;
                prevRow[j] = (prevRow[j-1] + val) % M;
            
            }
            
            dp = prevRow;
            
        }
        
        return ((dp[k] + M - (k > 0 ? dp[k-1] : 0)) % M);
    
    }


    //gives tle
    public int kInversePairs(int n, int k) {
        int dp[][] = new int[n+1][k+1];


        for (int i = 0; i <= n; i++) {
             for (int j = 0; j <= k; j++) {
                if(j == 0){
                    dp[i][j] =1;
                }else{
                    for (int j2 = 0; j2 <= Math.min(j , i-1); j2++) {
                        dp[i][j] = (dp[i][j] + dp[i-1][j-j2]  - j2) % 1000000007;
                    }
                }
             }
        }
        return dp[n][k];
    }
    public static void main(String[] args) {
    
}

}
