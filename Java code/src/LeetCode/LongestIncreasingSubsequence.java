import java.util.TreeSet;

public class LongestIncreasingSubsequence {
    // Slight disclaimer about the nlogn solution. Since the answer requires count, the solution would work. However, if the answer required a valid sublist, it wouldn't work. Try for the input [4,5,6,3]. Here, in the last iteration, we would search if there is an element greater than 3 (which is all of the elements). we will delete 4 and insert 3, which is obviously wrong ([3,5,6] js not a valid sublist). The count is guaranteed to stay correct as we replace values.
    // https://leetcode.com/problems/longest-increasing-subsequence/
    public int lengthOfLIS(int[] nums) {
     TreeSet<Integer> bst = new TreeSet<>();   
      
     for (int num : nums) {
       
          Integer higherORequalElement = bst.ceiling(num);
          //this means no higher or equal element exit in tree for current element  
          if(higherORequalElement == null){
               bst.add(num);
            }else{
                bst.remove(higherORequalElement);
                bst.add(num);
          }
     }

     return bst.size();
    
    
    }

    public static void main(String[] args) {
    
}    
}
