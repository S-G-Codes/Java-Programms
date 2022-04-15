import javax.swing.tree.TreeNode;

public class TrimaBST {
    // https://leetcode.com/problems/trim-a-binary-search-tree/
    //Approach
    //1. Traverse the left side of tree
    //2. Traverse the right side of tree
    //3 . Consider the root node.
        // * if the root node is in the range[L, R], return it as it is.
        // * else if root node value is less than L, return root.right.
        // * else if root node value is greater than R, return root.left.
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return root;

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        if(root.val < low || root.val > high){
           if(root.left == null)   return root.right;
             
           if(root.right == null) return root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        
    }
}
