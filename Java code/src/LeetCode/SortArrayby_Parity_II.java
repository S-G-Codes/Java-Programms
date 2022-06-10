public class SortArrayby_Parity_II {
    // https://leetcode.com/problems/sort-array-by-parity-ii/
    //Approch
    //1 we will find two elment which will be an odd no at even index and even no at odd index
    //2 swap them
    public int[] sortArrayByParityII(int[] nums) {
       
        int oddNo_at_EvenIndex = 0;
        int evenNo_at_OddIndex = 1;
        int n  = nums.length;

        while(oddNo_at_EvenIndex < n && evenNo_at_OddIndex < n){
           
            //finding odd no at even index
            //when we'll come out of this while loop we will have an odd no at even index
            while(oddNo_at_EvenIndex < n && nums[oddNo_at_EvenIndex] %2 ==0){
                  oddNo_at_EvenIndex +=2;
            }

            //finding even no at odd index
            //when we'll come out of this while loop we will have an even no at odd index
            while(evenNo_at_OddIndex < n && nums[evenNo_at_OddIndex] %2 ==1){
                 evenNo_at_OddIndex +=2;
            }


            //swaping those
             if(oddNo_at_EvenIndex < n && evenNo_at_OddIndex < n){
                 swap(nums , oddNo_at_EvenIndex , evenNo_at_OddIndex);
             }



        }
   
return nums;
    }

    private void swap(int[] nums, int i, int j) {
            if(i != j ){
                 int temp = nums[i];
                 nums[i] = nums[j];
                   nums[j]= temp;
            }

    }
}
