import java.util.Arrays;

public class MergeSortedArray {
    // https://leetcode.com/problems/merge-sorted-array/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //we are tracking element from behind and also filling from behind
         int i = m+n -1;           //for filling nums1 
         int j = n -1;             //for tracking nums2
         int k = m -1 ;               //for tracking nums1 from behind

      
         while(j>=0){             //we will break when we have tracked all nums2 element
         if(nums1[k] > nums2[j] && k>=0){
              nums1[i] = nums1[k];
              i--;
              k--; 
         }else{
            nums1[i] = nums2[j];
            j--;
            i--;
         }
         }



    }
    public static void main(String[] args) {
        
    }
}
