import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    // https://leetcode.com/problems/path-sum-ii/

    //TCc O(n)
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();


        dfs(root, 0, new ArrayList<>(),ans,targetSum);
     return ans;
    }

    private void dfs(TreeNode root, int runningSum, List<Integer> runningList,  List<List<Integer>> ans, int targetSum) {
       
 if(root == null) return;


 int totalCurrentSum =  runningSum + root.val;

 runningList.add(root.val);

 if(root.left == null && root.right == null && totalCurrentSum == targetSum){
    ans.add(new ArrayList<>(runningList));
    return;
 }


 dfs(root.left, totalCurrentSum, new ArrayList<>(runningList), ans, targetSum);
 dfs(root.right, totalCurrentSum, new ArrayList<>(runningList), ans, targetSum);

    }

    public static void main(String[] args) {
        
    }
}
