public class LowestCommonAncestor {
    // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         if(root == null) return null;
// if current root value is greater than both p and q value that means root is in left of current root
         if(root.val > p.val && root.val > q.val){
           return lowestCommonAncestor(root.left, p, q);
         }
         if(root.val < p.val && root.val < q.val){
           return lowestCommonAncestor(root.right, p, q);
         }

         return root;
    }
    public static void main(String[] args) {
        
    }
}
