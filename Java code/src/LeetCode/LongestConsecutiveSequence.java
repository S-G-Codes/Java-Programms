import java.util.HashSet;

public class LongestConsecutiveSequence {
    // https://leetcode.com/problems/longest-consecutive-sequence/
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxConsecutiveCount = 0;

        for (int  n : nums) {
             if(!set.contains(n-1)){
                 int currentElement = n;
                 int currentCount =1;

                 while(set.contains(currentElement+1)){
                     currentElement +=1;
                     currentCount +=1;
                 }

                 maxConsecutiveCount = Math.max(currentCount, maxConsecutiveCount);
             }
        }
        return maxConsecutiveCount;
    }
    public static void main(String[] args) {
        
    }
}
