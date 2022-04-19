import javax.swing.tree.TreeNode;
import javax.xml.crypto.KeySelector.Purpose;

public class RecoveraBST {
    // https://leetcode.com/problems/recover-binary-search-tree/


    // Approch is simple
    // Tc = O(n)
    // Sp = O(logn)  //height of the tree

    //1. Do a inorder traversal of tree
    //2 . as we know inorder means strictly increasing order
    //3. so when we see the dip we will we will store that val in a variable and move forward and find the second wrong node and also store it into a variable
    // 4 . now we swap them  

    private TreeNode prev = null;
    private TreeNode firstNode = null;
    private TreeNode secondNode = null;
    public void recoverTree(TreeNode root) {
         inorder(root);
       
        //  swapping
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
    }


    private void inorder(TreeNode curr){
           if(curr == null) return;
           inorder(curr.left);
            
        //    this means we found the dip
           if(prev!=null && prev.val > curr.val){
               if(firstNode == null){
                   firstNode = prev;
               }
               secondNode = curr;
           }

           prev = curr;
           inorder(curr.right);
    }
    public static void main(String[] args) {
        
    }
}
