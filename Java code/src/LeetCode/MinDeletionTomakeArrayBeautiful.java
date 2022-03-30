public class MinDeletionTomakeArrayBeautiful {
    //url https://leetcode.com/problems/minimum-deletions-to-make-array-beautiful/

    public int minDeletion(int[] nums) {
        //Ans should be even in length as said in question if the final ans length is odd make it even by deleting the last element bcz as question say they don't care what there on odd index of array
        
        //Another important catch in this is to left shift the whole array when you delete one of the element 
        
        //Beautiful array are those whose total length is even and there even index next element both should be not equal if its same delete one of it and left shift the whole array
        
        
        int d =0;
        int n = nums.length;
        
        for(int i =0 ;i< n-1; i++){
            int newIdx = i -d;
            
            if(newIdx % 2 ==0 && nums[i] == nums[i+1]){
                d++;
            }
        }
        
        return ( (n-d) % 2 ==0) ? d : d+1;
            
        
    }
   public static void main(String[] args) {
       
   } 
}
