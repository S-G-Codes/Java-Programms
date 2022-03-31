public class SplitArray_Largest_Sum {
     
    //NOTE for me - check waterfall book for more detail approch

//Google level Question  //sexy problem 
//Also same as pages allocation to student in Geeks for geeks

//Approch
//What to return?  we have given an array and a m and we want to make subarray from that array which should be contionous and non-empty means atleast one element should be present and only m subarrays you can make from it 
//now we have to return the smallest sum of subarray from all the possible sum of subarray (in m pieces only)

// 1. make a start and end  initially with 0
//2 . find the max element from the array  
//3. A binary search checking for each subarray 
//4. check that have we made the subarray in m pieces if not readjust start and end
//5. At end return start or end both are gonna be same


    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        
        for(int i = 0; i<nums.length; i++){
            //Put the min in start
            start = Math.max(start , nums[i]);      //In the end this will give us the Max element from array
            //Put max in end
            end += nums[i];
        }
        
        
        //binary search
        while(start < end){
             int mid = start + (end - start)/2;    //  try for the middle as potential ans
        
            int pieces = 1;    //atleast 1 piece toh hoga he bhai
            int sum = 0;
            
           
            
            for(int num : nums){
                if(sum + num > mid){    //if this cond is true means you cannot add this into sub array
                    sum = num;   //instead make another piece of subarray and put all that num in sum
                    pieces++;
                }else{
                    sum+=num;      //else add all the num element's sums in sum
                }
            }
            
             if(pieces <= m){        
            end = mid;                 
        }else{
            start = mid+1;    //Sort of search in Right side
        }
        }
        
       
        
        return start;
        // return end;             //both will be same at our answer
         
    }
    public static void main(String[] args) {
        
    }
}
