public class ArthimeticTriplets {
    // https://leetcode.com/contest/weekly-contest-305/problems/number-of-arithmetic-triplets/
    //i<j<k
    // j-i == diff
    // k -j ==diff
    public int arithmeticTriplets(int[] nums, int diff) {
               //brute force  O(n3)
               int ans = 0;

               for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    for (int k = j+1; k < nums.length; k++) {
                        if(nums[i] < nums[j] && nums[j] < nums[k]){
                                 if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff){
                                    ans++;
                                 }
                        }
                    }
                }
               }
               return ans;
    }
   
    public static void main(String[] args) {
        
    }
}
