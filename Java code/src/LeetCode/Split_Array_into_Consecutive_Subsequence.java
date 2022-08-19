import java.util.HashMap;
import java.util.Map;

// TC : O(n)
	// SC : O(n)
public class Split_Array_into_Consecutive_Subsequence {
    // https://leetcode.com/problems/split-array-into-consecutive-subsequences/
    public boolean isPossible(int[] nums) {
        Map<Integer,Integer> avaibilityMap = new HashMap<>();
        Map<Integer,Integer> vacancyMap = new HashMap<>();


        for (int i : nums) {
            avaibilityMap.put(i, avaibilityMap.getOrDefault(i, 0)+1);
        }


        for (int i = 0; i < nums.length; i++) {
            if(avaibilityMap.get(nums[i])<=0){
                continue;
            }else if(vacancyMap.getOrDefault(nums[i], 0)>0){

                vacancyMap.put(nums[i], vacancyMap.getOrDefault(nums[i],0)-1);
				//System.out.println("Vacancy found for " +  (nums[i]+1));

				vacancyMap.put(nums[i]+1, vacancyMap.getOrDefault(nums[i]+1,0)+1);
			}

			else if(avaibilityMap.getOrDefault(nums[i],0)>0 && avaibilityMap.getOrDefault(nums[i]+1,0)>0 && avaibilityMap.getOrDefault(nums[i]+2,0)>0){

				avaibilityMap.put(nums[i], avaibilityMap.getOrDefault(nums[i],0)-1);
				avaibilityMap.put(nums[i]+1, avaibilityMap.getOrDefault(nums[i]+1,0)-1);
				avaibilityMap.put(nums[i]+2, avaibilityMap.getOrDefault(nums[i]+2,0)-1);

				vacancyMap.put(nums[i]+3, vacancyMap.getOrDefault(nums[i]+3,0)+1);
			}

			else{
				return false;
			}
		}

		return true;
    }
    public static void main(String[] args) {
        
    }
}
