import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Deepest_Leave_sum {
    // https://leetcode.com/problems/deepest-leaves-sum/

    public int deepestLeavesSum(TreeNode root) {
        
        Queue <TreeNode> q = new LinkedList<>();
         int sum = 0;
          q.offer(root);
         while(!q.isEmpty()){
             
            int size = q.size();
            sum=0;

             while(size-- >0){
                TreeNode head =  q.poll();  
                sum += head.val;

                if(head.left != null){
                    q.offer(head.left);

                }

                if(head.right !=null){
                    q.offer(head.right);
                }


             }

         }

         return sum;

    }

    // Constant space Approch

    // int maxHeight = Integer.MIN_VALUE;
    // int height = 0;
    // int maxSum = 0;
    // public int deepestLeavesSum(TreeNode root) {
    //     inorderDFS(root,height);
    //     return maxSum;
    // }
    // public void inorderDFS(TreeNode root, int height){
    //     if(root == null) return;
    //     height += 1;
    //     inorderDFS(root.left,height);
    //     if(root.left == null && root.right==null){ // Node is leaf
    //         if(maxHeight < height){
    //             maxHeight = height;
    //             maxSum = root.val;
    //         }
    //         else if(maxHeight == height){
    //             maxSum = maxSum + root.val;
    //         }
    //     }
    //     inorderDFS(root.right,height);
    // }

    public static void main(String[] args) {
        
    }
}
