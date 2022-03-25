class RemoveDuplicates_From_No_Extra_space{

    public int removeDuplicates(int[] nums) {
       //we will be using two pointers 
        //start from 0 and fast form start+1 Whenever we get 2 distinct(unique ) element we will incremnet the start position and also place that element at that start position       
       
       //eg1  // • 1, 1, 2 -> 1, 2, 1


//eg 2
        //     0,0,1,1,1,2,2,3,3,4
        // • 0,1,1,1,1,2,2,3,3,4
        // • 0,1,2,1,1,2,2,3,3,4
        // 0,1,2,3,1,2,2,3,3,4
        // • 0,1,2,3,4,2,2,3,3,4 
        //         |           |                 At the end this is where my pointers will be start at 3 and end at 4 so we will return start +1 so per as our question 

        int start =0;

       for (int fast = 1; fast < nums.length; fast++) {
            if(nums[start] != nums[fast]){
                nums[++start] = nums[fast];
            }
       }

       return start +1;
    }



    public static void main(String[] args) {
        
    }
}