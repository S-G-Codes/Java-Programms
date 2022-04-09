public class SingleNumber {
    // https://leetcode.com/problems/single-number/
  static  public int singleNumber(int[] nums) {
        int n = nums.length;
        int x = 0;
            for(int i = 0; i <n;i++){
            x = x^nums[i];
            
        }
        
            
        return x;
    }
    public static void main(String[] args) {
         int  [] nums = {4,1,2,1,2};
          System.out.println(singleNumber(nums));
    }
}
