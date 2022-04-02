import javax.swing.tree.TreeNode;

public class MergeTwpoBinaryTree {

    // https://leetcode.com/problems/merge-two-binary-trees/

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return    merge(root1 , root2);
    }

    private TreeNode merge(TreeNode root1 , TreeNode root2){
          //base cond
          
          if(root1 == null && root2 == null) return null;

          if(root1 == null && root2!= null) return root2;
          if(root1 != null && root2== null) return root1;

          //if we have came till here means boths roots have some value now just add them in a new Tree

          TreeNode sum = new TreeNode(root1.val + root2.val);

          sum.left = merge(root1.left, root2.left);
          sum.right = merge(root1.right, root2.right);

          return sum;


    }



    //more optimized will be in constant space

//     public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//         if(root1 == null && root2 == null) return null;

//         if(root1 == null && root2!= null) return root2;
//         if(root1 != null && root2== null) return root1;


//   root1.val = root1.val + root2.val;

//   root1.left = mergeTrees(root1.left, root2.left);
//   root1.right = mergeTrees(root1.right, root2.right);

//   return root1;
//     }
    public static void main(String[] args) {
        
    }
}
