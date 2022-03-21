public class MaximumProductofSubArray {

//https://leetcode.com/submissions/detail/664200853/
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int ans = nums[0];

         for(int i =1 ; i< nums.length ;i++){
             int tempMax = Math.max(nums[i] * max, Math.max(nums[i] * min , nums[i]));
             min = Math.min(nums[i] * max , Math.min(nums[i] * min , nums[i]));
             
             max = tempMax;
             
             ans = Math.max(ans, max);
         }
        
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
