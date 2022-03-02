public class searchANode {

// url  = https://practice.geeksforgeeks.org/problems/search-a-node-in-bst/1

    boolean search(Node root, int x) {
        if(root == null) return false;
        
        if(x== root.data) return true;
        
        if(x<root.data){
            return search(root.left,x);
        }else{
            return search(root.right,x);
        }
      }
}
