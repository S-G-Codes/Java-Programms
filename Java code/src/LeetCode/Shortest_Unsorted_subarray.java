import java.util.Stack;

public class Shortest_Unsorted_subarray {
    // https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
    public int findUnsortedSubarray(int[] nums) {
       Stack<Integer> stk = new Stack<>();

       int left = nums.length -1;
       for (int i = 0; i < nums.length; ) {
             
        if(stk.isEmpty()){
          stk.push(i);
          i++;
        }else{
          if(nums[stk.peek()] > nums[i]){
            left = Math.min(left, stk.peek());
            stk.pop();
          }else{
            stk.push(i);
            i++;
          }
        }
       }

       stk.clear();

       int right = 0;

        for (int i = nums.length -1; i >= 0; ) {
            if(stk.isEmpty()){
              stk.push(i);
              i--;
            }else{
              if(nums[stk.peek()] < nums[i]){
                right = Math.max(right, stk.peek());
                stk.pop();
              }else{
                stk.push(i);
                i--;
              }
            }
        }


        if(left >= right){
          return 0;
        }else{
          return right - left +1;
        }
    }
    public static void main(String[] args) {
        
    }
}
