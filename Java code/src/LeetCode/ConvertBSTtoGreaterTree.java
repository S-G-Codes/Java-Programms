public class ConvertBSTtoGreaterTree {
    // https://leetcode.com/problems/convert-bst-to-greater-tree/
    //Apprch is simple
    //1. Travel to Right side and maintain a global variable which will contain sum and then update the that particular value with that  variable + node.val;
     //2. Same for left side

// Tc = O(n)
//sc = O(logn)          //height of BST

     Integer sum = 0;        //Global variable
    public TreeNode bstToGst(TreeNode root) {
      if(root == null) return null;
      
      bstToGst(root.right);
       root.val = root.val + sum;
       sum = root.val;
       bstToGst(root.left);

       return root;
    }
    public static void main(String[] args) {
        
    }
}
