import java.util.HashMap;

public class Subarray_of_Given_Sum {

    //leet code 
    //url https://leetcode.com/problems/subarray-sum-equals-k/submissions/
   
    public int subarraySum(int[] nums, int k) {
        //sum is prefix sum or cumaltive sum 
        int sum = 0;
        int ans = 0; 
        
        HashMap<Integer, Integer> map = new HashMap<>();
        //adding firt key and value in map 
        map.put( 0 ,1);
        
         for(int i =0; i < nums.length; i++){
             sum += nums[i];          //adding first element in sum 
             
             if(map.containsKey(sum-k)){            //if our map contains the sum - k value means we got out first subarray so add it into ans
                 ans += map.get(sum-k);
             }
             
             map.put(sum, map.getOrDefault(sum , 0) +1);  //now go forward in map
         }
        return ans;
    }


    public static void main(String[] args) {
        
    }
}
