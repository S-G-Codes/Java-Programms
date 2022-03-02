public class subtree_of_tree {
    
    
    // LeetcodeQuestion 572
    // url https://leetcode.com/problems/subtree-of-another-tree/
    
    
    
    
    
    
    
    
    
    //     isIdentical fn checks if the matched root leftsubtree and matched root rightsubtree matches or not
    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        
        //         base cond if our both  root is null and subroot is also null so there no tree so will true
                if(root==null && subRoot == null) return true;
                
        //         if one of the root is null then there will no subtree for that so will return false
                if(root == null || subRoot == null) return false;
                
        //         if both the root matches check for thier left subtree and right subtree 
                 if(root.val == subRoot.val){
                return isIdentical(root.left ,subRoot.left) && isIdentical(root.right , subRoot.right);
                 }
                 return false;
            }
            
            
            
            public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //         if our subroot is null means its present in main tree bcz every tree has a null tree
                if(subRoot == null) return true;
                
        //         if our main is only null so there will be no subtree for that
                if(root == null) return false;
                
        //         if our both roots value or data is matching then check for leftsubtree and rightsubtree of the matched root
                // if(root.val == subRoot.val){
                    if(isIdentical(root,subRoot)){
                        return true;
                    // }
                }
                
               
                    return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
                
               
                // discussion answer using dfs
                   /**
   * Time O(n)
   * Space O(h)
   */
//   public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//     if (root == null) return false;
//     if (dfs(root, subRoot)) return true;
//     return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//   }

  /**
   * Time O(n)
   * Space O(h)
   *   - Each element costs constant space O(1).
   *     And the size of the stack is exactly the depth of DFS.
   *     So in the worst case, it costs O(h) to maintain the system stack,
   *     where h is the maximum depth of DFS.
   */



//   public boolean dfs(TreeNode root, TreeNode subRoot) {
//     if (root == null && subRoot == null) return true;
//     if (root == null || subRoot == null) return false;
//     if (root.val != subRoot.val) return false;
//     return dfs(root.left, subRoot.left) && dfs(root.right, subRoot.right);
//   }
                
                
            }
   public static void main(String[] args) {
       
   } 
}
