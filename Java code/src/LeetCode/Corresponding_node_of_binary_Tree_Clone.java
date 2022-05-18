public class Corresponding_node_of_binary_Tree_Clone {
    // https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
    private TreeNode ans;
    private TreeNode target;
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            this.target = target;
          inorder( original, cloned);
          return ans;
    }
    
    
    public void inorder(TreeNode og , TreeNode c){
         
        if(og!=null){
            inorder(og.left, c.left );
            if(og == target){
                ans = c;
                
            }
            
            inorder(og.right , c.right);
        }
        
    }
}
