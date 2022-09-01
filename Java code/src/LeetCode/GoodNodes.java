public class GoodNodes {
    // https://leetcode.com/problems/count-good-nodes-in-binary-tree/
    public int goodNodes(TreeNode root) {
         
        if(root == null) return 0;
        int count =1;

         count += dfs(root.left , root.val);
         count += dfs(root.right , root.val);
         return count;
    }
    private int dfs(TreeNode root, int currentMax) {
       int count = 0;
       
       if(root == null) return count;

       if(root.val >= currentMax){
            count++;
            currentMax = root.val;
       }

    count +=  dfs(root.left, currentMax);
      count +=  dfs(root.right, currentMax);

        return count;
    }
    public static void main(String[] args) {
        
    }
}
