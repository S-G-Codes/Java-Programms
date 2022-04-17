import java.util.Stack;

import javax.swing.tree.TreeNode;

class IncreasingOrderSearchTree{
    // https://leetcode.com/problems/increasing-order-search-tree/
    //Approch  follow inOrder Traversal
    //1. Travel the left side until last points towards next and also add to a stack
    //2. so now pop the first element from the stack which is the left most element now make it as  our new head as per as our question
    //3 . now if prev!= null then make prev.right = top
    //4 . update prev = top and curr = top.right
    public TreeNode increasingBST(TreeNode root) {
        TreeNode prev = null;
        TreeNode  head = null;
        TreeNode curr = root;

          Stack<TreeNode> s = new Stack<>();
         while(!s.isEmpty() || curr!= null){
             while(curr!=null){
                 s.push(curr);
                 curr = curr.left;
             }

             //pop the first element
             TreeNode top = s.pop();
   // making out left as null as per question
             top.left = null;

             if(head == null){
                 top = head;
             }

             if(prev !=null){
                 prev.right = top;

             }

             prev = top;
             curr = top.right;

         }
         return head;
    }
    public static void main(String[] args) {
        
    }
}