import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets_Leetcode78 {

    // https://leetcode.com/problems/subsets/

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length == 0) {
            return ans;
        }

        ans.add(new ArrayList<>());

        backTracking(nums, ans, new ArrayList<>(), 0);
        return ans;
    }

    private void backTracking(int[] nums, List<List<Integer>> ans, List<Integer> temp, int index) {

        if (index >= nums.length) {
            return;
        } else {
            for (int i = index; i < nums.length; i++) {
                temp.add(nums[i]);
                ans.add(new ArrayList<>(temp));
                backTracking(nums, ans, temp, i + 1);
                temp.remove(temp.size() - 1);
            }
        }

    }

    public static void main(String[] args) {

    }
}
