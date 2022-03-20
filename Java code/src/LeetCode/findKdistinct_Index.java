public class findKdistinct_Index {

//https://leetcode.com/contest/weekly-contest-284/problems/find-all-k-distant-indices-in-an-array/
//Tc = O(n2)  can be optimized
//Sp = O(n)

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
     
        
        List<Integer> jidx = new ArrayList<Integer>();
         Set<Integer> set = new HashSet<Integer>();
     
     
    
     for(int i =0; i< nums.length; i++){
         if(nums[i] == key){
             jidx.add(i);
         }    
     }
     
            for(int i =0; i< nums.length; i++){
                for(int j : jidx){
                    if(Math.abs(i-j) <=k && nums[j] ==key){
                        set.add(i);
                    }
                }
                
            }
     
        List<Integer> ans = new ArrayList<>(set);
     Collections.sort(ans);
     
     
     return ans;
     
     
 }
}
