public class MinCost_For_climbing_Stairs {

    // https://leetcode.com/problems/min-cost-climbing-stairs/
    public int minCostClimbingStairs(int[] cost) {
        // with memo

        int dp [] = new int[cost.length+1];
           
       dp[0]= cost[0];
       dp[1]= cost[1];

       for (int i = 2; i < cost.length; i++) {
        //finding the cost of current stair by taking min of previous cost of 2 stairs
               dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
       }

       //As we know we can go atleast 1 stair up or 2 stair up
       return Math.min(dp[cost.length -1], dp[cost.length-2]);

        }

     


        

    public static void main(String[] args) {
        
    }
}
