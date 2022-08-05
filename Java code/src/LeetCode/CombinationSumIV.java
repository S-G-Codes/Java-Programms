import java.util.HashMap;
import java.util.Map;

public class CombinationSumIV {
    // https://leetcode.com/problems/combination-sum-iv/

    //key = Target .  Value = Combination_Count
    Map<Integer, Integer> map = new HashMap<>();
    public int combinationSum4(int[] nums, int target) {
        
    return combinationSum4Helper(nums, target);

    }
    private int combinationSum4Helper(int[] nums, int target) {
        int possibleWays = 0;
        if(map.containsKey(target)){
            return map.get(target);
        }


        if(target == 0){
            return 1;
        }else if( target <0){
            return 0;
        }else{
            for (int i : nums) {
                 possibleWays += combinationSum4Helper(nums, target-i);
            }

            map.put(target, possibleWays);

            return possibleWays;
        }
        
    }
    public static void main(String[] args) {
        
    }
}
