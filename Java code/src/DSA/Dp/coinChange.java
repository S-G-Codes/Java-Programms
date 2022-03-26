public class coinChange {


//TC = O(m)raise to n
// where m is no of coins given and n is no of time recursion calls 
//This Question is solve using recursion it TC can be reduced to O(m *n) using dp
public static int minCoins(int sum , int coins[]) {

//base cond
if(sum ==0) return 0;

int ans = Integer.MAX_VALUE;

for (int i = 0; i < coins.length; i++) {
    
    if(sum - coins[i] >=0){
        int subAns = minCoins(sum - coins[i], coins);

        if(subAns +1 < ans && subAns != Integer.MAX_VALUE){
             ans  = subAns +1;
        }

    }
}
return ans;
    
}









    public static void main(String[] args) {
        int sum = 18;
        int coins [] = {1,7,5};
         
        int ans = minCoins(sum, coins);
        System.out.println(ans);
    }
}
