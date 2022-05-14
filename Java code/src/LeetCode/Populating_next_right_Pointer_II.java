import java.util.LinkedList;
import java.util.Queue;

public class Populating_next_right_Pointer_II {
    // https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/

    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
         Node nextRight = null;
            while(size-- >0){
                Node head = q.poll();
                head.next =  nextRight;
                nextRight = head;

                if(head.right!= null){
                   q.add(head.right);
                }

                if(head.left!=null){
                    q.add(head.left);
                }
            }
            
        }
        return root;
    }
    public static void main(String[] args) {
        
    }
}
