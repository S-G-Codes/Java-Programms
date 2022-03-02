public class InsertANode {

//  url  https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1


    Node insert(Node root, int Key) {
        
        if(root == null){
           
            return new Node(Key);
        }
        
        if(root.data > Key){
            root.left = insert(root.left , Key);
            
        }else if(root.data < Key){
            root.right = insert(root.right , Key);
            
        }
        return root;
        
       
    }
}
