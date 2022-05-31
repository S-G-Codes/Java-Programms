import java.util.Arrays;

public class Valid_Traingle_Number {
    public int triangleNumber(int[] nums) {
        int count =0;
        if(nums.length < 3) return 0;

        //Brute force
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //         for (int j = i+1; j < nums.length; j++) {
        //             for (int j2 = j +1; j2 < nums.length; j2++) {
        //                 if(nums[i] + nums[j] > nums[j2]){
        //                     count++;
        //                 }
        //             }
        //         }
        // }
        // return count;


        //Two pointer Approch
        Arrays.sort(nums);
  int ans =0;
        for (int i = 2; i < nums.length; i++) {
             int left = 0;
             int right = i-1;

             while(left < right){
                   if(nums[left] + nums[right] > nums[i]){
                     ans += right - left;
                     right--;
                   }else{
                       left++;
                   }
             }
        }
        return ans;
        
         
    }
    public static void main(String[] args) {
        
    }
}
