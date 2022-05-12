import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermautionsII {
    // https://leetcode.com/problems/permutations-ii/

    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        Set<List<Integer>> setAns = new HashSet<>();

        boolean[] visited = new boolean[n];

        backTracking(nums , setAns , visited , new ArrayList<>());
         
        for (List <Integer> i : setAns) {
            ans.add(i);
        }
        return ans;
        
    }


private void backTracking(int[] nums , Set<List<Integer>> res, boolean[] visited , List<Integer> subList) {
    
    if(subList.size() == nums.length){
        res.add(new ArrayList<>(subList));
    }



    for (int i = 0; i < nums.length; i++) {
         if(!visited[i]){
             subList.add(nums[i]);
             visited[i] = true;
             backTracking(nums, res, visited, subList);
             visited[i] = false;
             subList.remove(subList.size() -1);
         }
    }

}
public static void main(String[] args) {
    
}    
}
