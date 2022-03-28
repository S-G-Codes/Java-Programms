public class ClimbStairs {

    // https://leetcode.com/problems/climbing-stairs/submissions/

    public int climbStairs(int n) {
        // dp with memorization tech.
        int dp[] = new int[n + 1];
        return climbStairs1(n, dp);

    }

    public int climbStairs1(int n, int[] dp) {
        if (n == 1 || n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }

        if (dp[n] > 0) {
            return dp[n];
        }

        int s1 = climbStairs1(n - 1, dp);
        int s2 = climbStairs1(n - 2, dp);

        int total = s1 + s2;

        dp[n] = total;
        return total;

    }



    //dp with tabulation
    

    public static int dpwithTab(int n , int[] dp) {
        dp[0] = 1;

        for (int i = 1; i <=n; i++) {
             
           if(i==1){
               dp[i] = dp[i-1];
           }else {
               dp[i] = dp[i-1] + dp[i-2];
           }


        }
        return dp[n];
    }
         


    public static void main(String[] args) {

    }
}
