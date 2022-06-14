import java.util.List;

class Partiation_to_k_equal_subset{
    // https://leetcode.com/problems/partition-to-k-equal-sum-subsets/


  public boolean canPartitionKSubsets(int[] nums, int k) {
        
   if(nums.length < k) return false; 
    int totalSum = 0;

    for (int i : nums) {
         totalSum += i;
    }

    if(totalSum % k != 0 ) return false;
     
    int subsetSum  = totalSum/k;
    boolean []visited = new boolean[nums.length];
    return backTracking( nums , visited , 0 , k , 0, subsetSum);
    }
    
    
    private boolean backTracking(int[] nums, boolean[] visited, int start, int k, int currSum, int subsetSum) {
    
        if(k ==0) return true;
        if(currSum > subsetSum) return false;
        if(currSum == subsetSum){
            return backTracking(nums, visited, 0, k-1, 0, subsetSum);
        }
  
  
  
        for (int i = start; i < nums.length; i++) {
        if(visited[i]) continue;
        visited[i] =  true;
        if(backTracking(nums, visited, i +1, k, currSum + nums[i], subsetSum)) return true;
        visited[i] = false;
   }
   return false;
}


    public static void main(String[] args) {
        
    }
}