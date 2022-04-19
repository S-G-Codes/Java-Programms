import java.util.ArrayList;
import java.util.List;

public class MajorElementII {
    // https://leetcode.com/problems/majority-element-ii/
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> ans = new ArrayList<Integer>();
        if (nums.length == 0)
            return ans;
        int firstPM = Integer.MAX_VALUE;
        int firstPM_vote = 0;
        int secondPM = Integer.MIN_VALUE;
        int secondPM_vote = 0;


        for (int i = 0; i < nums.length; i++) {
            // vote for both
            if (nums[i] == firstPM) {
                firstPM_vote++;
            } else if (nums[i] == secondPM) {
                secondPM_vote++;
            } else if (firstPM_vote == 0) { // I am standing also
                firstPM = nums[i];
                firstPM_vote = 1;
            } else if (secondPM_vote == 0) {
                secondPM = nums[i];
                secondPM_vote = 1;
            } else { // if theres a new candidate decrease the above vote
                firstPM_vote--;
                secondPM_vote--;
            }
        }

        // Elections are over lets calculate the votes
        firstPM_vote = 0;
        secondPM_vote = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == firstPM) {
                firstPM_vote++;
            } else if (nums[i] == secondPM) {
                secondPM_vote++;
            }

        }
        if (firstPM_vote > nums.length / 3)
            ;
        ans.add(firstPM);

        if (secondPM_vote > nums.length / 3) {
            ans.add(secondPM);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
