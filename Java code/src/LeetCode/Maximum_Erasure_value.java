import java.util.HashSet;
import java.util.Set;

public class Maximum_Erasure_value {
    // https://leetcode.com/problems/maximum-erasure-value/
    //Approch Two pointer
    //1. start with two varaible start and end form nums[0]
    //2.create a set add if elemt is not present already and add the elem in Running Sum and take max between Running sum and MaxSum
    //3. if it contains then keep removing the elements with help of start pointer until we get the same elemt to add up in elemet again also delete from RunningSum
    public int maximumUniqueSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        int RunningSum = 0;
        int MaxSum = 0;

   Set<Integer> st = new HashSet<>();
   while(end < nums.length){
              int currentEl = nums[end];
                 if(!st.contains(currentEl)){
                    st.add(currentEl);
                    RunningSum += currentEl;
                    MaxSum = Math.max(RunningSum, MaxSum);
                    end++;
                 }else{
                     int deletingEl = nums[start];
                     st.remove(deletingEl);
                     RunningSum -= deletingEl;
                     MaxSum = Math.max(RunningSum, MaxSum);      //not necessary but still
                     start++;
                     
                 }
        }

        return MaxSum;
    }
}
