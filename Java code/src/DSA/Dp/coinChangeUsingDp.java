import java.util.Arrays;

public class coinChangeUsingDp {
    //Tc = O(m *n)
    public static int minCoins(int sum , int coins[] , int dp[]) {

        //base cond
        if(sum ==0) return 0;
        
        int ans = Integer.MAX_VALUE;
        
        for (int i = 0; i < coins.length; i++) {
            
            if(sum - coins[i] >=0){
                int subAns =0;
            
                if(dp[sum - coins[i]] != -1){
                    subAns  = dp[sum - coins[i]];
                }else{

                    subAns = minCoins(sum - coins[i], coins, dp);
                }

        
                if(subAns +1 < ans && subAns != Integer.MAX_VALUE){
                     ans  = subAns +1;
                }
        
            }
        }
        return dp[sum] = ans;
            
        }
        
        
        
        
        
        
        
        
        
            public static void main(String[] args) {
                int sum = 18;
                int coins [] = {1,7,5};
                 
                int dp[] = new int[sum+1];
                Arrays.fill(dp, -1);
                dp[0] =0;


                int ans = minCoins(sum, coins, dp);
                System.out.println("Min coins will be needed is " +ans);

                System.out.print("All the indexs value we are storing for dp array  are ");

                for (int x : dp) {
                    System.out.print( +  x + " ");
                }

                //output 4 same as recursion

               
            }
        }

