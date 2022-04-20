import java.util.Stack;

import javax.swing.tree.TreeNode;

public class BSTIterator {
    Stack<TreeNode> stack = null;
    TreeNode current = null;
    public BSTIterator(TreeNode root) {
        current = root;
        stack = new Stack<>();
    }
    
    public int next() {
         while(current !=null){

             stack.push(current);
             current = current.left;
         }

         TreeNode t = stack.pop();
         current = t.right;
         return t.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty() || current != null;
    }

    public static void main(String[] args) {
        
    }
}
