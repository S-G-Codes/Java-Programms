public class RemoveDuplicates_from_Array_II {

//url https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
    public int removeDuplicates(int[] nums) {
      
    if(nums.length < 3) return nums.length;
        int start =2;
  for (int fast = start; fast < nums.length; fast++) {
       if(nums[start -2] != nums[fast]){
           nums[start++] = nums[fast];
       } 
  }

  return start;
       
    }
    public static void main(String[] args) {
        
    }
}
