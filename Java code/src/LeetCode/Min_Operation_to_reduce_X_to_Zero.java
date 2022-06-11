import java.util.HashMap;
import java.util.Map;

public class Min_Operation_to_reduce_X_to_Zero {
    // https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/
    public int minOperations(int[] nums, int x) {
         int totalSum = 0;
         for (int i : nums) {
               totalSum += i;
         }

         int target = totalSum -x;

         Map<Integer , Integer> map = new HashMap<>();

         map.put(0, -1);

         int maxLenSubArray = -1;
         int prefixSum = 0;
   
          for (int i = 0; i < nums.length; i++) {
             prefixSum  += nums[i];
              map.put(prefixSum, i);
              if(map.containsKey(prefixSum - target)){
                int currLenSubArray = i - map.get(prefixSum - target);
                   
                maxLenSubArray = Math.max(maxLenSubArray, currLenSubArray);
                
              }
          }

          if(maxLenSubArray == -1){
            return maxLenSubArray;
          }else{
            return nums.length - maxLenSubArray;
          }
         
    }
    public static void main(String[] args) {
        
    }
}
