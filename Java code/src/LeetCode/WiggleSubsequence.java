public class WiggleSubsequence {
    // https://leetcode.com/problems/wiggle-subsequence/

 //Approch draw a graph for the array and dry run
 

    public int wiggleMaxLength(int[] nums) {
        if(nums.length <=1){
             return nums.length;
        }

  int up =1;
  int down = 1;

  for (int i = 0; i < nums.length -1; i++) {
         if(nums[i] > nums[i+1]){
              down = up+1;
         }else if(nums[i] < nums[i+1]){
            up  = down+1;
         }
  }


  return Math.max(down, up);
    
         


    }
    public static void main(String[] args) {
        
    }
}
