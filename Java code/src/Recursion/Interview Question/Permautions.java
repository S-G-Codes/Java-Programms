import java.util.ArrayList;
import java.util.Arrays;

class Permautions{
    // https://leetcode.com/problems/permutations/
    public List<List<Integer>> permute(int[] nums) {
          //backtracking

          List<List<Integer>> ans = new ArrayList<List<Integer>>();

          Integer [] numbers = new Integer[nums.length];

          for (int i = 0; i < nums.length; i++) {
               numbers[i] = nums[i];  
          }

          permuations(numbers , 0 , ans);
           

          return ans;
    }

   
    public static void permuations(Integer[] nums , int idx ,  List<List<Integer>> ans) {
        
        //this for if we are at last index nothing more can be so add to ans and return
        if(idx == nums.length -1){
            ans.add(new ArrayList<Integer>(Arrays.asList(nums)));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            //swapping the elements to get the permautions
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;

            permuations(nums, idx +1, ans);     //recursively doing for other index too

           
            //bracktracking

            temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;

        }
        
    }

 

              
    public static void main(String[] args) {
        
    }
}