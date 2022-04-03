public class NextPermaution {
    // https://leetcode.com/problems/next-permutation/

//same approch as NextHighestNumber III
     
    public void nextPermutation(int[] nums) {
        int firstDeflexPoint = nums.length -1;

        while(firstDeflexPoint >=1 && nums[firstDeflexPoint-1] >= nums[firstDeflexPoint]){
            firstDeflexPoint--;
        }
 
        //we have told to question if no permaution is there return the lowest lexiographical order
        if(firstDeflexPoint ==0){
            Arrays.sort(nums);
            return;
        }
        
        //getting firstDeflex indexx
        firstDeflexPoint--;

        int secondPoint = nums.length-1;
       
        while(firstDeflexPoint < secondPoint && nums[firstDeflexPoint] >= nums[secondPoint]){
            secondPoint--;
        }
       
        //swap those numbers
        swap(nums , firstDeflexPoint , secondPoint);

             //reverse the rest of them as we did in nextHighest III
         int start = firstDeflexPoint +1;
         int end = nums.length -1;

         while(start < end){
             int temp = nums[start];
             nums[start] = nums[end];
             nums[end] = temp;
             end--;
             start++;
         }

    }
    private void swap(int [] nums , int firstDeflexPoint , int secondPoint) {
     
  if(firstDeflexPoint != secondPoint){
      int temp = nums[secondPoint];
      nums[secondPoint] =  nums[firstDeflexPoint];
      nums[firstDeflexPoint] = temp;
    }

    }

public static void main(String[] args) {
    
}

}