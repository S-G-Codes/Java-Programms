import javax.swing.tree.TreeNode;

class Sum_of_Nodes_with_Even_valued_grandparent{


     public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }
    // https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
   //Tc O(n)
    //Sp O(n)
    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
       
      
        dfs(root, null,null);
        return sum;
    }
    
    public void dfs(TreeNode root, TreeNode parent , TreeNode grand){
        if(root == null) return;
         if(grand != null && grand.val %2==0){
             sum += root.val;
         }
        
         if(root.left !=null){
             dfs(root.left, root, parent);
         }
                 if(root.right !=null){
             dfs(root.right, root, parent);
         }
    }
    public static void main(String[] args) {
        
    }
}
