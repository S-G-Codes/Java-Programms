public class CoinchangeDP {


    public int coinChange(int[] coins, int amount) {
        
        //initalize a dp array of size amount +1
        int [] dp = new int[amount+1];   
        //put Integer.Max_Value Intially in it
        Arrays.fill(dp , Integer.MAX_VALUE);
        
        //and Zeroth element will be always zero
        dp[0] =0;
        
        
        //Run a loop for each join
        for(int i =0; i < coins.length; i++){

            //Run a loop in dp array and check if amount to made is less than the coins given then it not possible
            for (int j = coins[i]; j < dp.length; j++) {
                
                if(dp[j - coins[i]] != Integer.MAX_VALUE){
                       
                    //this will be min value for us +1 because we are using coins[i] coins. Uskoh toh beh lena padegha Imagine our sol in Rec Tree format you will get it
                    int ans = dp[j - coins[i]] +1;
                    

                    //store the min one in dpth j element
                    dp[j] = Math.min(dp[j], ans);


                }
            }
        }

                //and if the amount is less than then coint then the above two loop will not run so we will return -1 as below else our ans 
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        
    }
}
