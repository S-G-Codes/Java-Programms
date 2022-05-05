public class Max_Consective_OneIII {
    // https://leetcode.com/problems/max-consecutive-ones-iii/
static    public int longestOnes(int[] nums, int k) {
        //sliding window Question
        int start = 0;
        int zeroCount = 0;
        int maxCons1 = 0;

        for (int end = 0; end < nums.length; end++) {
              if(nums[end] == 0){
                  zeroCount++;
              }

              while(zeroCount > k){
                  if(nums[start] == 0){
                      zeroCount--;
                  }
                  start++;
              }

              maxCons1 = Math.max(maxCons1, end - start +1);
        }
        return maxCons1;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k =2;
        System.out.println(longestOnes(nums, k));
    }
}
