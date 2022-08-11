public class Valide_Binary_Search_Tree {
    // https://leetcode.com/problems/validate-binary-search-tree/
    public boolean isValidBST(TreeNode root) {
              return isBST(root, Long.MAX_VALUE, Long.MIN_VALUE);      
    }
    
    private boolean isBST(TreeNode root, long minValue, long maxValue) {
            //every null tree is a valid BST
        if(root == null) return true;

        if(root.val >=  minValue || root.val <= maxValue) return false;


        return isBST(root.left, root.val, maxValue) && isBST(root.right, minValue, root.val);
    }

    public static void main(String[] args) {
        
    }
}
