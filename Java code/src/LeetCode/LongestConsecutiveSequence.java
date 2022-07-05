import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    // https://leetcode.com/problems/longest-consecutive-sequence/
    // public int longestConsecutive(int[] nums) {
    //     if(nums.length == 0) return 0;
    //     if(nums.length == 1) return 1;
    //     HashSet<Integer> set = new HashSet<>();

    //     for (int num : nums) {
    //         set.add(num);
    //     }

    //     int maxConsecutiveCount = 0;

    //     for (int  n : nums) {
    //          if(!set.contains(n-1)){
    //              int currentElement = n;
    //              int currentCount =1;

    //              while(set.contains(currentElement+1)){
    //                  currentElement +=1;
    //                  currentCount +=1;
    //              }

    //              maxConsecutiveCount = Math.max(currentCount, maxConsecutiveCount);
    //          }
    //     }
    //     return maxConsecutiveCount;
    // }

//Approch
// Take a number checks if set contains its next no and previous no ie if no is 12 check for 13 or 11 in set if contains increase the count variable and remove the elemet 
    public int longestConsecutive(int[] nums) {
          Set<Integer> set = new HashSet<Integer>();
             
          for (int i : nums) {
              set.add(i);
          }

       int maxLength = 0;

       for (int element : nums) {
       int currentLength = 1;
        int left = element;
              int right = element;

              while(set.contains(left-1)){
                  currentLength++;
                  set.remove(left-1);
                  left--;
              }
              while(set.contains(right+1)){
                  currentLength++;
                  set.remove(right+1);
                  right++;
              }
              maxLength = Math.max(maxLength, currentLength);
       }

       return maxLength;

            


    }
    public static void main(String[] args) {
        
    }
}
