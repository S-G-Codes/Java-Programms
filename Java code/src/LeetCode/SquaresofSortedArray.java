public class SquaresofSortedArray {

    //url https://leetcode.com/problems/squares-of-a-sorted-array/

    public int[] sortedSquares(int[] nums) {
       
        //One of the Approch but TC will not be efficient
//         for(int i = 0; i< nums.length; i++){
//                nums[i] *= nums[i];
//         }
//                 Arrays.sort(nums);

//             return nums;

        
//         Two Pointer Approch
    
           int low = 0;
        int high = nums.length -1;
        int idx = nums.length -1;
        int ans[] = new int[nums.length];
        
        
        while(low<=high){
            if(Math.abs(nums[low]) > Math.abs(nums[high])){
                ans[idx] = nums[low] * nums[low];
                low++;
            }else {
                ans[idx] = nums[high] * nums[high];
                high--;
            }
            idx--;
        }
        
        return ans;
        
        
    }
    public static void main(String[] args) {
        
    }
}
