class Flatten_binary_Tree_to_LL{
    // https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
    public void flatten(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)){
            return ;
        }

        postOrderhelper(root);
    }

    // LRI
    private TreeNode postOrderhelper(TreeNode root){
        if(root == null){
            return null;
        }

        TreeNode leftChild = postOrderhelper(root.left);
        TreeNode rightChild = postOrderhelper(root.right);

        TreeNode extremeRightOfLC = leftChild;
        while(extremeRightOfLC!=null && extremeRightOfLC.right!=null){
            extremeRightOfLC = extremeRightOfLC.right;
        }

        if(extremeRightOfLC!=null){
            extremeRightOfLC.right = rightChild;
            root.right = leftChild;
        }

        root.left = null;
        return root;
    }
    
    public static void main(String[] args) {
        
    }
}