import java.util.Stack;

public class One_Thirty_Two_Pattern {
    // https://leetcode.com/problems/132-pattern/

      //Tc O(n) sc O(n)
           //Monostatic stack tech
    public boolean find132pattern(int[] nums) {
          
        Stack<Integer> stk = new Stack<>();

        int secondMax = Integer.MIN_VALUE;

    for (int i = nums.length-1; i >= 0; i--) {
        
        if(nums[i] < secondMax) return true;
         
        while(!stk.isEmpty() && nums[i] > stk.peek() ){
        secondMax  = Math.max(stk.pop(), secondMax);
        }
       stk.push(nums[i]);

    }

    return false;

    }
   public static void main(String[] args) {
       
   } 
}
