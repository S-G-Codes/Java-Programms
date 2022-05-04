import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Max_no_of_K_SumPairs {
    // public int maxOperations(int[] nums, int k) {
        
    //     //brute force TC O(nlogn) SC O(1)
    //     if(k < 1 || nums.length < 1 ) return 0;
    //     Arrays.sort(nums);
    //     int count = 0;
        
    //     int low = 0;
    //     int high = nums.length -1;
    //     int target = 0;
        
    //     while(low<high){
          
    //         target = nums[low] + nums[high];
            
    //         if(target ==k){
    //             low++;
    //             high--;
    //             count++;
    //         }else if(target > k){
    //              high--;
    //         }else{
    //             low++;
    //         }
            
                 
             
    //     }
    //     return count;
    // }

    //using hashmap
    //TC = O(n)
    //SC = O(n)
    public int maxOperations(int[] nums, int k) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
         
        for (int element : nums) {
             if(map.containsKey(k - element)){
                  int freq = map.get(k - element);
                  if(freq ==1){
                      map.remove( k -element);

                  }else{
                      map.put(k - element, freq -1);

                  }
                  count++;
             }else{
                map.put( element, map.getOrDefault(element, 0) +1);
             }
        }
       
                 
             
        
        return count;
    }
    public static void main(String[] args) {
        
    }
}
