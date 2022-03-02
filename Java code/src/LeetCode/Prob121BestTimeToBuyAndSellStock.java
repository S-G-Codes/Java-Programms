class Prob121BestTimeToBuyAndSellStock{

    // Leetcode Question 121  
    public int maxProfit(int[] prices) {
        int maxP =0;
        int minSofar = prices[0];
        
        for(int i =0; i< prices.length; i++){
            minSofar = Math.min(minSofar,prices[i]);
            int profit = prices[i] - minSofar;
            maxP = Math.max(maxP,profit);
        }
        return maxP;
    }
    public static void main(String[] args) {
       
    }
}