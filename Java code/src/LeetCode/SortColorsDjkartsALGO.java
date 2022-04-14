public class SortColorsDjkartsALGO {
    // https://leetcode.com/problems/sort-colors/
    // Approch
    //1. Dutch algo says that all the 0 will be between arr[0] to arr[low-1]
    //2 . All the 2's will be arr[high] to arr[n-1]
    //3. All the 1's will be in  arr[low] to arr[mid-1]
    public void sortColors(int[] nums) {

        
           int low = 0;
           int mid = 0;
           int high = nums.length-1;

           while(mid<=high){
               if(nums[mid] < 1){
                     swap(nums, low, mid);
                     low++;
                     mid++;
               }else if(nums[mid] >1){
                     swap(nums, mid, high);
                     high--;
               }else{
                   mid++;
               }
           }
    }


      private void swap(int [] nums, int first , int second){
              int temp = nums[first];
              nums[first] = nums[second];
              nums[second] = temp;
      }
    public static void main(String[] args) {
        
    }
}
