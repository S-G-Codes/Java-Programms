import javax.swing.text.DefaultEditorKit.CutAction;

public class Populating_Next_Right_Pointers {

    // https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
   
    public Node connect(Node root) {
          
        //base cond 
        if (root == null) return null;

          //for not loosing root
        Node current = root;
      
        //this while for travelling all left nodes of tree
        while(current.left != null){
            //keeping current.left tracked
            Node nextLevel = current.left;

            //this while loop for traveling the whole tree
    while(current !=null){
        //pointing our all left node's next to roots rights node
       current.left.next = current.right;
      
       //if theres nothing on right side then point it towards null
       if(current.next == null){
           current.right.next = null;
       }else{
        
           current.right.next = current.next.left;
       }

       //keep traveling the whole tree
       current = current.next;

    }
     // incrementing the nextLevel
    current  = nextLevel;

        }
        return root;


        
    }
    public static void main(String[] args) {
        
    }
}
