import java.util.Arrays;

public class Two_sum_II {

    //url https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

    //approch is pretty simple we will use two pointers 
    //since we have only one answer we can take first and last element and add them sum and will keep checking its get match with target
    //if it matches then as per question we will return there indexs since in Question array is starting from 1 so will add +1 in our low and high or start or end or whatever
    //NOTE Edge case is as its given array is sorted so if last element then target we will simply keep decreasing the high by 1 until we get high <= target 

static   public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length -1;
        
        while(numbers[low]  + numbers[high] != target){
      
            
           if(numbers[low] + numbers[high] > target){
               high--;
           }else{
               low++;
           }
        }
        return new int[] {low+1,high+1};
        
    }
    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
    int target =9;
    
System.out.println("I think we are in loop");
   System.out.println(Arrays.toString(twoSum(numbers, target)) );
   
System.out.println("No we are not Thankgod");

    }
}
