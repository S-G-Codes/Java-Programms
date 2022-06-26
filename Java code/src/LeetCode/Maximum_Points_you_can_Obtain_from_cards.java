public class Maximum_Points_you_can_Obtain_from_cards {
    // https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
   
    //Sliding window question
    //Approach - 
    //1.Calculate sum till k , take a varable for ans add total variable value in it as default
    //2. iterate using two pointer  i starting from arr[k-1] and j staring from  end of array
    //3. Keep iterating till i >=0 and
    //4. add the differnece of arr[j] - arr[i] in total 
    //5. Take max of total in ans in ans variable
    //6 return ans  
    public int maxScore(int[] cardPoints, int k) {
        //edge case
        if(cardPoints.length == k){
            int ans = 0;
            for (int i : cardPoints) {
                 ans+= i;
            }
            return ans;
        }

        int total = 0;
        
        for (int i = 0; i < k; i++) {
              total += cardPoints[i];
        }

        int ans = total;
        int n = cardPoints.length;

        for (int i = k-1 , j = n-1; i >=0; i-- , j--) {
             total += cardPoints[j] - cardPoints[i];
            ans = Math.max(ans, total);
        }

        return ans;

          


        
       
       
   }
    public static void main(String[] args) {
        
    }
}
