import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum {
    // https://leetcode.com/problems/4sum/
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
                
        //-3 bcz we need min 4 element
        for (int i = 0; i < nums.length -3 ; i++) {
            
                if( i != 0 && nums[i] == nums[i-1]){   //to avoid duplicacy
                    continue;
                }
                  
                //-2 bcz j will handle 3 element and i will handle one element
                for (int j = i+1; j < nums.length - 2; j++) {

                     if(j != i+1 &&  nums[j] == nums[j-1]){ //to avoid duplicacy
                   continue;
                     }
                  
                     int left = j+1;
                     int right = nums.length -1;

                     while(left < right){
                         int sum = nums[i] + nums[j]  + nums[left] + nums[right];

                         if(sum < target){
                             left++;
                         }else if(sum > target){
                             right--;
                         }else{
                             //this when my sum== target
                          
                             List<Integer> list = new ArrayList<Integer>();
                                   list.add(nums[i]);
                                   list.add(nums[j]);
                                   list.add(nums[left]);
                                   list.add(nums[right]);
                                ans.add(list);
                                
                                left++;
                                right--;

                                  //this to while ot avoid duplicacy
                                while(left < right && nums[left] == nums[left-1]){
                                    left++;
                                }
                                while(left< right && nums[right] == nums[right+1]){
                                    right--;
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
