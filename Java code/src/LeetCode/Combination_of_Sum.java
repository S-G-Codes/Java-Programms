import java.util.ArrayList;
import java.util.List;

public class Combination_of_Sum {
    List<List<Integer>> list = new ArrayList<>(); 
    // https://leetcode.com/problems/combination-sum/

     //Classic BackTracking Question 
    //Draw a Recursive Tree for better Understanding

    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            
        if(candidates.length ==0){
            return list;
        }
            backTracking( candidates , target, new ArrayList<>() ,  0 , 0 );
            return list;
    }

    private void backTracking( int[] candidates, int target, List<Integer> temp , int currSum , int index) {
             
        if(currSum > target || index >= candidates.length){
          return;
        }

        if(currSum== target){
            list.add(new ArrayList<>(temp));
            return;
        }


        for (int i = index; i < candidates.length; i++) {
               temp.add(candidates[i]);
              backTracking(candidates, target, temp, currSum + candidates[i], i);
              temp.remove(temp.size()-1);  

        }

    }
}
