import java.util.LinkedList;
import java.util.Queue;

public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        
        if(d==1){
       TreeNode newNode = new TreeNode(v);
       newNode.left = root;
       return newNode;
        }



        Queue<TreeNode> q = new LinkedList<>();

        d = d-1;  //for parent node

        q.offer(root);
        int level =1;

        while(level !=d){
            int size = q.size();
            level++;
            while(size-->0){
                TreeNode head = q.poll();
                if(head.left!=null){
                    q.offer(head.left);
                }
                if(head.right!=null){
                    q.offer(head.right);
                }
            }
        }


while(!q.isEmpty()){

  TreeNode head = q.poll();
            TreeNode leftChild = head.left;
            TreeNode rightChild = head.right;

            TreeNode newLeft = new TreeNode(v);
            TreeNode newRight = new TreeNode(v);

            head.left = newLeft;
            head.right = newRight;

            newLeft.left = leftChild;
            newRight.right = rightChild;
        }

        return root;

    }
    
    public static void main(String[] args) {
        
    }
}
