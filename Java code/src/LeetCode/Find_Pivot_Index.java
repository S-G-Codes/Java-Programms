public class Find_Pivot_Index {
    // https://leetcode.com/problems/find-pivot-index/ 
      //Approch
      //1. caluculate total sum
      //2 Run a loop and in that calculate the rightSum by this rightSum = totalSum - nums[i] - leftSum
      //3. if left Sum == right sum return i
      //4. else add that nums[i] in leftSum


    public int pivotIndex(int[] nums) {
         
        int totalSum = 0;
        int leftSum = 0;
        int rightsum = 0;

        for (int i : nums) {
              totalSum += i;
        }
        
        
        for (int i = 0; i < nums.length; i++) {
                rightsum = totalSum - nums[i] - leftSum;
                 
                if(leftSum ==    rightsum){
                    return i;
                }else{
                    leftSum += nums[i];
                }


        }

        return -1;
    }
}
