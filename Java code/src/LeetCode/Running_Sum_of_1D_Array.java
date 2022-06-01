public class Running_Sum_of_1D_Array {
    // https://leetcode.com/problems/running-sum-of-1d-numsay/submissions/
  static  public int[] runningSum(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        
        prefix[0] = nums[0];
        for(int i = 1; i < n; ++i){
              prefix[i] = prefix[i-1] + nums[i];
        }
        
        return prefix;
    }
    public static void main(String[] args) {
        int nums[] = { 10, 4, 16, 20 };

      
  
      
    }
}
