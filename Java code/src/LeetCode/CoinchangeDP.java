import java.util.Arrays;

public class CoinchangeDP {

    // approch 
    //1. using dp we will find how to reach a certain amount with possible coin given 
    //2. taking math.min

    public int coinChange(int[] coins, int amount) {
        int dp[]= new int[amount+1];

        // filling all index with infinity first
        Arrays.fill(dp, Integer.MAX_VALUE);
       
        //filling 0 index with 0 bcz to reach amount 0 we need 0 coins
        dp[0]= 0;

        for (int i = 1; i <= amount; i++) {
             for (int coin : coins) {
                 if(i -  coin >=0 && dp[i-coin] != Integer.MAX_VALUE){
                     dp[i] = Math.min(dp[i], dp[i-coin] +1);
                 }
             }
        }

        //this means theres no way to achieve that amount/target
        if(dp[amount] == Integer.MAX_VALUE){
            return -1;
        }else{
            return dp[amount];
        }

        
    }

    public static void main(String[] args) {
        
    }
}
